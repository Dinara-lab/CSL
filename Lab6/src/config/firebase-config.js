// Import the functions you need from the SDKs you need

import firebase from "firebase/compat/app";
import "firebase/compat/auth";
import "firebase/compat/firestore";
import "firebase/analytics";
import "firebase/storage";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyAcOF4GgRsT0z82Mid59RHlsTXK7UXmIdQ",
  authDomain: "newproject-3d0a8.firebaseapp.com",
  projectId: "newproject-3d0a8",
  storageBucket: "newproject-3d0a8.appspot.com",
  messagingSenderId: "1051325083249",
  appId: "1:1051325083249:web:555b5244f3d7175db675d0",
  measurementId: "G-3NMP3H53ZF",
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);
export default firebase;
