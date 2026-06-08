# vcsos – Java SE 学习之旅 / Java SE Learning Journey

此仓库记录了我学习 **Java 标准版 (Java SE)** 的完整过程。内容涵盖从基础语法到多线程、反射等高级特性，并通过学生管理系统和 LeetCode 题目进行实战练习。

This repository tracks my full journey learning **Java Standard Edition (Java SE)**. It covers everything from basic syntax to advanced topics such as multithreading and reflection, along with hands‑on practice through a student management system and selected LeetCode problems.

---

## 📁 仓库结构 / Repository Structure
vcsos/
├── .idea/ # IntelliJ IDEA 项目配置

│ # IntelliJ IDEA project configuration

├── javase.iml # IntelliJ 模块文件 / IntelliJ module file

├── module1 ~ module7 # Java 基础（数据类型、运算符、流程控制、数组等）

│ # Java fundamentals (data types, operators, control flow, arrays, etc.)

├── module8 # 模块九：static 关键字 / Module 9: static keyword

├── module9 # 模块十：继承 / Module 10: Inheritance

├── module10 # 继承（续）& 模块十一：接口（部分）

│ # Inheritance (continued) & Module 11: Interfaces (partial)

├── module11 # 接口 & 模块十二：内部类（部分）

│ # Interfaces & Module 12: Inner classes (partial)

├── module12 # 内部类 & 模块十三：异常（部分）

│ # Inner classes & Module 13: Exceptions (partial)

├── module13 # 模块十四：String 类 / Module 14: String class

├── module14 # 模块十四：String（补充内容） / Module 14: String (additional)

├── module15 # 模块十五：集合框架 / Module 15: Collections framework

├── module16 # 模块十六：IO 流 & 模块十七：线程 / Module 16: I/O streams & Module 17: Threads

├── module17 # 线程 & 模块十八：反射 / Threads & Module 18: Reflection

├── module18 # 线程与反射（续） / Threads & Reflection (continued)

├── module19 # LeetCode 热题 100：015，011 / LeetCode Hot 100: #015, #011

├── module20 # LeetCode 练习 / LeetCode practice

├── StudnetManage/ # 学生管理系统（综合运用继承、接口等 OOP 知识）

│ # Student Management System (demonstrating OOP, inheritance, interfaces)

└── LeetCode/ # LeetCode 题解文件夹 / Folder for additional solutions

> **注意：** 目录名中的模块编号沿用了课程结构的原始编号；中文描述中提到的模块号有时会与目录名相差一位（例如 `module8` 对应课程“模块九”）。  
> **Note:** The module numbering in directory names follows the original course structure; the Chinese descriptions sometimes refer to a different module number (e.g., `module8` corresponds to course Module 9).

---

## 🚀 涵盖主题 / Topics Covered

| 类别 Category                | 模块 Modules                                      |
| ---------------------------- | ------------------------------------------------- |
| **Java 基础 / Basics**       | module1 – module7                                 |
| **Static 与关键字**          | module8                                           |
| **面向对象编程 (OOP)**       | module9, module10 (继承), module11 (接口)         |
| **高级类特性**               | module11, module12 (内部类)                       |
| **异常处理**                 | module12, module13                                |
| **常用 API**                 | module13, module14 (String)                       |
| **集合框架**                 | module15                                          |
| **IO 流**                    | module16                                          |
| **多线程**                   | module16, module17, module18                      |
| **反射**                     | module17, module18                                |
| **算法解题**                 | module19, module20, LeetCode 文件夹 (热题 100)    |
| **综合项目**                 | `StudnetManage`（完整的学生增删改查系统）          |

---

## 🛠️ 工具与环境 / Tools & Environment

- **语言 / Language:** Java (JDK 8+)
- **IDE:** IntelliJ IDEA（已包含 `.idea` 和 `*.iml` 配置文件）
- **版本控制 / Version Control:** Git（提交历史可见）

---

## 📖 如何使用 / How to Use

1. **克隆仓库** / **Clone the repo**

git clone https://github.com/<your-username>/vcsos.git

使用 IntelliJ IDEA 打开项目（.idea 文件夹和 javase.iml 会自动配置环境）。

Open the project in IntelliJ IDEA (the .idea folder and javase.iml will configure the environment automatically).


浏览 module* 目录查看代码示例与练习。

Navigate through the module* directories to see code examples and exercises.


学生管理项目位于 StudnetManage/ 下，可单独作为模块参考其 OOP 设计。
For the student management project, open StudnetManage/ as a separate module or refer to its code to see OOP principles in action.


LeetCode 题解存放在 module19、module20 和 LeetCode/ 文件夹中。
LeetCode solutions are available in module19, module20, and the LeetCode/ folder.


📌 学习亮点 / Learning Highlights
module15 – 深入理解 List、Set、Map 及其实现类。
Deep dive into List, Set, Map and their implementations.


module17 & module18 – 系统学习线程创建、同步、线程池以及反射 API。
Comprehensive exploration of thread creation, synchronization, thread pools, and reflection APIs.


module19 – 实现 LeetCode 热题 100 中的第 15 题（三数之和）和第 11 题（盛最多水的容器），附详细注释。
Implementation of LeetCode Hot 100 problems #15 (3Sum) and #11 (Container With Most Water) with detailed comments.


🤝 参与贡献 / Contribution
这是一个个人学习日志仓库，但欢迎提出建议或讨论！如果发现错误或有疑问，欢迎提 issue。
This repository is a personal learning log, but suggestions and discussions are welcome! Feel free to open an issue if you spot an error or have a question.

📄 许可证 / License
本项目仅用于教育目的。所有代码可按 MIT 许可证 自由使用（若你选择添加许可证文件）。
This project is for educational purposes. All code is free to use under the MIT License (if you choose to add one).

持续编码，持续进步！ Keep coding, keep improving!
