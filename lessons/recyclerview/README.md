- title: Android RecyclerView
- tags: android, activities, lifecycle, fragments

# Objectives

- Learn how to add several fragments to an activity
- Learn how to use a Recycler View

# Resources

- [Fragments](https://developer.android.com/guide/components/fragments.html)
- [Activities](https://developer.android.com/guide/components/activities.html)
- [Creating Lists and Cards](https://developer.android.com/training/material/lists-cards.html)
- [RecyclerView Api](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html)

# Lecture

During this lecture, we will build a recycler view that displays a list of items. After selecting an item in the list, a user will
navigate to the fragment that list item represents.

Each list item will be generated from [EmployeeDescription](
https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/blob/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook/EmployeeDescription.java), a class that represents an individual worker of the grocery store.


It is important to understand how all the classes in the [EmployeeHandbook](https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/tree/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook) package relate.

- Where is the RecyclerView created?
- How is the RecyclerView Adapter related to the RecyclerView?
- What is the purpose of [EmployeeViewHolder](https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/blob/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook/EmployeeViewHolder.java)?
- Where does the data for [onBindViewHolder](https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/blob/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook/EmployeeListAdapter.java#L31) come from?
- What is the purpose of the [bind](https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/blob/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook/EmployeeViewHolder.java#L29) function?

## Assignment
- Add an employee description representing yourself.
- Modify the codebase to launch an [EmployeeView](https://github.com/JsjRoboticsClassroom/AndroidGroceryStore/blob/master/app/src/main/java/nyc/c4q/grocerystore/employeeHandbook/EmployeeView.java) activity when your employee description is selected.
- Modify the EmployeeView class so that when it is launched with only your Employee Description, it will display your fragment.
