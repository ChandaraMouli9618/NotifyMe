# 📢 Notification System - "Notify Me"

## 📝 Introduction

"Notify Me" is a **scalable notification system** that enables users to **subscribe and receive notifications** via multiple channels, such as **Email, SMS, and Push Notifications**.

The system follows **best practices** using various **design patterns** to ensure maintainability, flexibility, and scalability.

---

## 🎯 Features

- ✅ **Multi-channel Support** - Email, SMS, and Push notifications.
- ✅ **User Preferences** - Users can subscribe/unsubscribe from notifications.
- ✅ **Batch Processing** - Efficiently processes multiple notifications at once.
- ✅ **Scalable & Extensible** - Easily add new notification types like WhatsApp, Slack, etc.
- ✅ **Retry Mechanism** - Retries failed notifications.
- ✅ **Asynchronous Processing** - Uses queues for efficient notification dispatch.

---

## 🏗️ Architecture

The system follows a **modular and scalable architecture**, using multiple **design patterns** for better maintainability.

### **🔹 High-Level Architecture**

```text
+--------------------------+
|      User Interface      |
+-----------+--------------+
            |
            v
+--------------------------+
|    Notification Manager  |  (Facade Pattern, Singleton Pattern)
+-----------+--------------+
            |
+-----------+-------------+
| Notification Factory     |  (Factory Pattern)
+-----------+-------------+
      |          |         |
+-----+--+  +----+--+  +-----+
| Email   |  | SMS   |  | Push |  (Strategy Pattern)
+--------+  +-------+  +------+
