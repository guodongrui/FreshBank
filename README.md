# 新手银行

## 目的

- Github, Git练手
  + 理解 Git 命令
  + 理解 Github 的 pull request

- 为软件工程课程项目作准备

## 描述

- 人有三种行为: 开账，存钱和取钱
- 银行会根据时间发利息，年利率 4%
- 真实时间的 2s == 1 年

## 场景描述

路人甲乙丙每人存钱 100, 甲一年后取出一半，乙一年后存入 100, 打印两年后甲乙丙的资产

## 实现

- VirtualYear, Person, Bank, Example(主类)四个类分别实现

## 分工

因为每个类都比较简单，可以用抽签决定工作

抽签结果如下:
  - zebinzou　　　　　　Example(主类)
  - zhenxiongwu　　　　Person
  - yubinliu　　　　　　VirtualYear
  - guodongrui　　　　　Bank

## 编译运行

```
javac Example.java -encoding utf-8
java Example
```

结果输出如果有中文乱码，试着把 git bash 的 option 设置 Text 的编码为 GBK
