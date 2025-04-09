# 🔀 Git Merge Conflict Training Repo

This repository is built for hands-on **merge conflict training**. It contains intentionally conflicting changes across multiple branches and file types, including JavaScript, C#, Java, and Markdown.

> 💡 None of the code is intended to compile or run—its only purpose is to simulate realistic merge conflict scenarios.

---

## 📁 Included Files

| File                | Language/Type | Purpose                             |
|---------------------|----------------|-------------------------------------|
| `calculator.js`     | JavaScript     | Function logic and logging changes  |
| `HomeController.cs` | .NET (C#)      | Return values and logging variations |
| `DemoService.java`  | Java           | Multi-function, deep conflict zones |
| `instructions.md`   | Markdown       | Textual/documentation conflicts     |

---

## 🔀 Conflict Scenarios

### 1. JavaScript — `calculator.js`
- **Branches**: `feature/change-add-to-subtract` vs `feature/add-logging`
- **Conflict**: Function logic vs console logging in the same method

### 2. C# — `HomeController.cs`
- **Branches**: `feature/uppercase-message` vs `feature/add-logging-cs`
- **Conflict**: Changed return strings vs added `Console.WriteLine` statements

### 3. Markdown — `instructions.md`
- **Branches**: `feature/update-instructions` vs `feature/add-prereqs`
- **Conflict**: Overlapping edits in doc instructions

### 4. Java (Complex) — `DemoService.java`
- **Branches**: `feature/complex-change-1` vs `feature/complex-change-2`
- **Conflict**: Multiple changes across different methods with logging, logic flips, and method additions

---

## 🧪 How to Trigger Conflicts

Pick one of the merge pairs below:

```bash
# JavaScript Conflict
git checkout feature/add-logging
git merge feature/change-add-to-subtract

# C# Conflict
git checkout feature/add-logging-cs
git merge feature/uppercase-message

# Markdown Conflict
git checkout feature/add-prereqs
git merge feature/update-instructions

# Complex Java Conflict
git checkout feature/complex-change-2
git merge feature/complex-change-1
```

---

## 🔧 Resolution Tips

- Use a **merge tool** (VSCode, KDiff3, etc.) or manual editing
- Don’t blindly pick “mine” or “theirs”—understand the change
- Preserve useful logic from both branches if possible
- Test (where applicable), even if logic isn't real
- Use clear commit messages when finishing merges

```bash
git add .
git commit -m "Resolve conflict between X and Y"
```

---

## ✅ Goal

By completing all merges and resolving the conflicts:
- You’ll understand common conflict patterns
- Practice resolving multiple conflict types (text/code/structure)
- Get confident using both CLI and GUI tools for resolution

---

Happy merging! 🎯
