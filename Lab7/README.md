# Laboratory Work 7
##### Authors: Bucila Dinara, Gherman Artiom
##### Group: FAF-193
In this laboratory work we created our own database usign `MongoDB`.
Our table contains such columns like `name`, `id`, `email` and
`password`. The `password` column contains only encrypted passwords.
The only way to decrypt it, is to run our app. There is possibility to
add some new data to our database. Also, our app uses `AES` algorithm
which is 2-way encryption algorithm. To be more sure about
securization we added such thing as `salt` which makes all rainbow tables
useless against weak passwords.

##### For running app you have to:
- Add into gradle dependencies driver for `mongodb`.
- Install MongoDB and connect server to `mongodb://localhost:27017`.
- Uncomment some lines of codes which were created for adding some new info.
- Add your information into arrays.
- Comment again these lines of code otherwise you add the same data twice after rerunning the program.