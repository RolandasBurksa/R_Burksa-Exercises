/* eslint-disable react/prop-types */
import "./App.css";
import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import EmployeeComponent from "./components/EmployeeComponent";
import ListDepartmentComponent from "./components/ListDepartmentComponent";
import DepartmentComponent from "./components/DepartmentComponent";
import RegisterComponent from "./components/RegisterComponent";
import LoginComponent from "./components/LoginComponent";
import { isUserLoggedIn } from "./services/AuthService";

function App() {
  function AuthenticatedRoute({ children }) {
    const isAuth = isUserLoggedIn();

    if (isAuth) {
      return children;
    }
    return <Navigate to="/" />;
  }

  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          {/* // http://localhost:3000 */}
          <Route path="/" element={<LoginComponent />}></Route>
          {/* // http://localhost:3000/employees */}
          <Route
            path="/employees"
            element={
              <AuthenticatedRoute>
                <ListEmployeeComponent />
              </AuthenticatedRoute>
            }
          ></Route>
          {/* // http://localhost:3000/add-employee */}
          <Route
            path="/add-employee"
            element={
              <AuthenticatedRoute>
                <EmployeeComponent />
              </AuthenticatedRoute>
            }
          ></Route>
          {/* // http://localhost:3000/edit-employee/1 */}
          <Route
            path="/edit-employee/:id"
            element={
              <AuthenticatedRoute>
                <EmployeeComponent />
              </AuthenticatedRoute>
            }
          ></Route>
          {/* // http://localhost:3000/departments*/}
          <Route
            path="/departments"
            element={<ListDepartmentComponent />}
          ></Route>
          {/* // http://localhost:3000/add-departmet*/}
          <Route
            path="/add-department"
            element={<DepartmentComponent />}
          ></Route>
          {/* // http://localhost:3000/edit-department/1 */}
          <Route
            path="/edit-department/:id"
            element={<DepartmentComponent />}
          ></Route>
          {/* // http://localhost:8080/register */}
          <Route path="/register" element={<RegisterComponent />}></Route>
          {/* // http://localhost:8080/login */}
          <Route path="/login" element={<LoginComponent />}></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;
