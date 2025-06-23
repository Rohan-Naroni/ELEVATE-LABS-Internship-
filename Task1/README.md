# 🔢 Java Console Calculator

A simple, interactive **console-based calculator** in Java that performs basic arithmetic operations (Addition, Subtraction, Multiplication, and Division) on **multiple numbers**.

---

## 📌 Features

- ✅ Menu-driven program using `while` loop and `switch`
- ✅ Accepts any number of inputs using arrays
- ✅ Handles **division by zero** gracefully
- ✅ Validates user input and avoids crashes
- ✅ Uses clean method-based structure
- ✅ Clear user interface with organized output

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Console/Terminal for interaction
- Scanner class for input handling

---

## 🚀 How It Works

1. User chooses an operation from the menu:
    Addition
    Subtraction
    Multiplication
    Division
    Exit

2. User enters how many numbers they want to calculate.
3. Calculator performs the operation on all numbers using a loop.
4. If `0` is entered in division, it prints a warning and skips result.

---

## 🧠 Key Concepts Practiced

- Arrays
- Loops (`while`, `for`)
- Methods with parameters and return values
- Input validation
- `Double.NaN` usage
- Switch-case logic
- Defensive programming (handling invalid input)

---

## ⚠️ Edge Case Handling

| Case                        | Handled? | Behavior                               |
|-----------------------------|----------|----------------------------------------|
| Invalid menu input          | ✅        | Shows error message, asks again       |
| Division by 0               | ✅        | Skips calculation, shows warning      |
| Floating-point inputs       | ✅        | Fully supported using `nextDouble()`  |
| Exiting the app             | ✅        | Clean exit on selecting option `5`    |

---

## 📝 Sample Output

enter which operation do you want to Perform

Addition
Subtraction
Multiplication
Division
Exit
3
on how many numbers you want to perform operation
4
Enter Numbers...
2
3
4
5
............Multiplication............
Result: 120.0

---

## ✅ Final Notes

This project helped me understand:
- How to structure Java methods for modularity
- How to handle edge cases like `0` in division
- User-friendly input/output formatting
- How to build and debug a real-world Java console app
