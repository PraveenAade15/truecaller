# Truecaller Android Technical Assignment

## 👨‍💻 PRAVEEN AADE 

---

## ✅ Problem Statement

Create an Android application that fetches content from the following URL as plain text:

🔗 [https://www.truecaller.com/blog/life-at-truecaller/life-as-an-android-engineer](https://www.truecaller.com/blog/life-at-truecaller/life-as-an-android-engineer)

Upon clicking a button, the app must perform the following 3 operations **in parallel**:

1. **Truecaller15thCharacterRequest**
   - Fetch the 15th character from the content.

2. **TruecallerEvery15thCharacterRequest**
   - Fetch every 15th character (i.e., 15th, 30th, 45th...).

3. **TruecallerWordCounterRequest**
   - Split text by whitespace and count how many times each **unique word** appears (case-insensitive).

Each result should be displayed **as soon as it's ready**, and results must be visible on the screen.

---

## 🧠 Assumptions

- The content fetched is treated as **plain text**, including HTML tags.  
- We do **not parse or strip HTML**, as per the spec.
- Each task should run **in parallel** using Kotlin Coroutines.
- The app should reflect **loading**, **success**, and **error** states for each task independently.

---

## 🏗️ Architecture

The app uses a clean **MVVM architecture** with proper separation of concerns:

