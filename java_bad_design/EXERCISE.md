# Exercise: What Happens When We Ignore OOP?

**File to study:** `java_bad_design/PayrollSystem.java`

This file is a working payroll calculator. It compiles, runs, and produces correct output.
Your job is **not** to fix it yet — first read it carefully, then try to extend it, and *then* redesign it.

---

## Part 1 — Read and Trace

Before writing any code, answer these questions by reading `PayrollSystem.java`.
Write your answers in a notebook or a comment block in the file.

1. `rateOrSalary[i]` is a single array that stores data for both `FULLTIME` and `PARTTIME` employees.
   What does the value **represent** for a FULLTIME employee?
   What does it represent for a PARTTIME employee?
   Are they the same unit of measurement?

2. Suppose your instructor asks you to rename the string `"FULLTIME"` to `"FULL_TIME"`.
   How many lines of code in how many methods would you need to change?
   List each method name.

3. What is the **maximum number of employees** this system can hold?
   Where exactly in the code is that limit set?
   What would happen if you tried to add an 11th employee?

4. Can any other class in the project accidentally write `PayrollSystem.employeeCount = -99`?
   What would happen to the program if it did?

5. Run the program and confirm the output matches what you expect.
   Manually calculate Alice Johnson's net pay using the rules in `calculateMonthlySalary`,
   `calculateTax`, and `calculateBonus`. Show your working.

---

## Part 2 — Extend the System (Feel the Pain)

Now make two changes to `PayrollSystem.java`. Do **not** rewrite the file —
work within the existing structure and see what it forces you to do.

### Task A — Add a CONTRACTOR Employee Type

The company now hires contractors. Here are the rules:

| Property | Rule |
|---|---|
| Pay | `dailyRate × daysWorked` per month |
| Tax | Flat 8% of monthly pay |
| Bonus | No bonus (contractors do not receive one) |
| Data stored | Daily rate in `rateOrSalary`, days worked in `workUnits` |

Steps to follow:
1. Add `"CONTRACTOR"` handling to `calculateMonthlySalary`.
2. Add `"CONTRACTOR"` handling to `calculateTax`.
3. Add `"CONTRACTOR"` handling to `calculateBonus`.
4. Add `"CONTRACTOR"` handling to `printReport` (it should show the type correctly — it may already, check).
5. Add this contractor to `main()`:
   - Name: `"Eve Torres"`, type: `"CONTRACTOR"`, daily rate: `350.0`, days: `20`
6. Run the program and confirm Eve's net pay is correct.

**Reflection question after Task A:**
How many separate `if/else if` blocks did you have to touch?
Did any of them feel like you were writing almost the same thing twice?

---

### Task B — Add a Performance Rating

HR wants each employee to have a **performance rating from 1 to 5**.
The rating multiplies the bonus: rating 1 = 0.5×, rating 3 = 1.0×, rating 5 = 2.0×.

Use this formula: `bonusMultiplier = rating / 3.0`

Steps to follow:
1. Add a new public static array `performanceRating` of type `int[]` with size 10.
2. Update `addEmployee` to accept and store a `rating` parameter.
3. Update `calculateBonus` to multiply the result by `rating / 3.0`.
4. Update all four `addEmployee` calls in `main()` to pass a rating (use any values 1–5).
5. Run the program and confirm bonuses change according to ratings.

**Reflection question after Task B:**
You needed to add **one** logical concept (a rating), but how many places in the code required changes?
What is the risk of missing one of those places in a larger codebase?

---

## Part 3 — Identify the Problems

Each question below points to a specific part of `PayrollSystem.java`.
Fill in the blank with the correct OOP term or principle.

1. Lines 15–19 store all employee data in four separate arrays instead of grouping related data into a single __________.

2. Fields like `employeeNames`, `employeeCount`, and `rateOrSalary` are declared `public static`, which means any other class can modify them without restriction. This is a violation of __________.

3. The methods `calculateTax()` and `calculateBonus()` each contain their own `if/else if (employeeTypes[i].equals(...))` block. Duplicating the same logic in multiple places violates the __________ principle (Don't Repeat Yourself).

4. To add a new employee type (like `"CONTRACTOR"`), you must modify `calculateMonthlySalary`, `calculateTax`, `calculateBonus`, and the documentation. This violates the __________ principle, which says a class should be open for extension but closed for modification.

5. `FULLTIME` and `PARTTIME` employees are clearly different kinds of employees. An OOP design would model this with an __________ class or an __________ that both types implement.

6. With an abstract class from question 5, the method `calculateMonthlySalary` could be declared __________ so that each subclass provides its own version — eliminating the `if/else if` chain entirely.

7. Using separate concrete subclasses for each employee type and calling a shared method name (`calculateNetPay`) without knowing the exact subclass is called __________.

8. The numbers `0.20`, `0.10`, `0.05`, `0.10`, and `0.05` appear scattered across `calculateTax` and `calculateBonus`. These are called __________ numbers and should be named constants.

9. `PayrollSystem` currently handles three distinct responsibilities: storing employee data, performing payroll calculations, and printing the report. A class with too many responsibilities violates the __________ principle.

10. Because all methods are `static` and operate on global arrays, it is impossible to have two independent payroll runs at the same time (e.g., for two departments). Proper use of __________ and __________ would allow multiple independent instances.

---

## Part 4 — Design a Better Solution

Before writing any code, sketch a class design on paper (or describe it in words).
Your design must address the problems from Part 3.

**Constraints:**
- Use at least one `abstract` class or `interface`.
- Each employee type must be its own class.
- The `calculateMonthlySalary`, `calculateTax`, and `calculateBonus` methods must be overridden per type — no `if/else if` type-checks allowed.
- A separate class (e.g., `PayrollProcessor`) should handle the report printing.

**Hints (do not look until you have tried):**
<details>
<summary>Hint 1 — What to make abstract</summary>
Which methods have different behaviour per employee type?
Those are the candidates for `abstract` methods in a base class.
Behaviour that is the same for all types (like `calculateNetPay`) can be `concrete` in the base class.
</details>

<details>
<summary>Hint 2 — Where the constants go</summary>
Tax rates and bonus rates are specific to each employee type.
They belong as `private static final` constants inside each subclass.
</details>

<details>
<summary>Hint 3 — The list problem</summary>
Once you have an `Employee` base class, you can store all employee objects in a single
`ArrayList<Employee>`. No more parallel arrays. No more index arithmetic.
</details>

For your design, answer these questions in writing:
- What is the base class or interface called? What methods does it declare?
- What are the concrete subclasses? What does each override?
- Where does `calculateNetPay` live? Why?
- How does the reporting class receive the list of employees?

---

## Part 5 — Implement the Redesign

Create a new package folder called `java_good_design/`.

Implement your design from Part 4. Requirements:

1. No `if/else if` type-check string comparisons anywhere.
2. Adding a third employee type in the future must require creating **one new class only** — no modification of existing classes.
3. Your `main()` must produce the same net pay values as the original for Alice, Carol, Bob, and David (use the same salary/rate/hours values).
4. Include Eve Torres from Task A as a `ContractorEmployee` class.
5. The performance rating from Task B must be supported cleanly (hint: it belongs in the base class).

When you are done, run both `PayrollSystem` and your new implementation side by side and compare the output.
