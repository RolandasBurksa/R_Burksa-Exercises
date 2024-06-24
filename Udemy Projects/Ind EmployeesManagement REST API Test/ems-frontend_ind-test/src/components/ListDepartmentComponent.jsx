import { useEffect, useState } from "react";
import {
  deleteDepartment,
  getAllDepatrments,
} from "../services/DepartmentService";
import { Link, useNavigate } from "react-router-dom";

const ListDepartmentComponent = () => {
  //   let dummyData = [
  //     {
  //       id: 1,
  //       departmentName: "ABC Department",
  //       departmentDescription: "CDE Description",
  //     },
  //     {
  //       id: 2,
  //       departmentName: "Department FGH",
  //       departmentDescription: "Description IKL",
  //     },
  //   ];

  //   const [departments, setDepartments] = useState(dummyData);

  const [departments, setDepartments] = useState([]);

  const navigator = useNavigate();

  useEffect(() => {
    listOfDepartments();
  }, []);

  function listOfDepartments() {
    getAllDepatrments()
      .then((response) => {
        console.log(response.data);
        setDepartments(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }

  function updateDepartment(id) {
    navigator(`/edit-department/${id}`);
  }

  function removeDepartment(id) {
    deleteDepartment(id)
      .then((response) => {
        console.log(response.data);
        listOfDepartments();
      })
      .catch((error) => {
        console.error(error);
      });
  }

  return (
    <div className="container">
      <h2 className="text-center">List of Departments</h2>
      <Link to="/add-department" className="btn btn-primary mb-2">
        Add Department
      </Link>
      <table className="table table-striped table-bordered ">
        <thead>
          <tr>
            <th>DepartmentId</th>
            <th>Department Name</th>
            <th>Department Description</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {departments.map((department) => (
            <tr key={department.id}>
              <td>{department.id}</td>
              <td>{department.departmentName}</td>
              <td>{department.departmentDescription}</td>
              <td>
                <button
                  onClick={() => updateDepartment(department.id)}
                  className="btn btn-info"
                >
                  Update
                </button>
                <button
                  onClick={() => removeDepartment(department.id)}
                  className="btn btn-danger"
                  style={{ marginLeft: "10px" }}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListDepartmentComponent;
