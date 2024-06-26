import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import EmployeeComponent from "./components/EmployeeComponent";
import ListDepartmentComponent from "./components/ListDepartmentComponent";
import DepartmentComponent from "./components/DepartmentComponent";
import RegisterComponent from "./components/RegisterComponent";

function App() {
  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          {/* // http://localhost:3000 */}
          <Route path="/" element={<ListEmployeeComponent />}></Route>
          {/* // http://localhost:3000/employees */}
          <Route path="/employees" element={<ListEmployeeComponent />}></Route>
          {/* // http://localhost:3000/add-employee */}
          <Route path="/add-employee" element={<EmployeeComponent />}></Route>
          {/* // http://localhost:3000/edit-employee/1 */}
          <Route
            path="/edit-employee/:id"
            element={<EmployeeComponent />}
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
          {/* // http://localhost:3000/register */}
          <Route path="/register" element={<RegisterComponent />}></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;
