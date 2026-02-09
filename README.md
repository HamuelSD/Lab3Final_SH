# Lab 3 Submission - Samuel Harvey

## Documentation
Please refer to **"Lab 3 Test Cases and TCI By Step - Samuel Harvey.pdf"** for the logical breakdown of my test cases:

1.  **Equivalence Partitions**
2.  **Boundary Value Analysis**
3.  **Decision Table (Refined)**
4.  **Final Consolidated Test Suite** (Efficient Coverage)
5.  **CSV File Format**

## Implementation of Tests
I utilized the provided `ReserveMyPark.java`. I reinstated the `NightReservationException` and added a new `InvalidAgeException` to catch negative age inputs.

The testing logic is split into two parts:
* **Standard Logic:** Driven by a `.csv` parameterized test.
* **Exception Handling:** Specific tests for invalid nights and ages are implemented as separate test methods within `ReserveMyParkTest.java`.
