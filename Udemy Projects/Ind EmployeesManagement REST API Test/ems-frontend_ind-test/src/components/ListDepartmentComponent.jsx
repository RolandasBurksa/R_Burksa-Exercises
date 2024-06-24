import { useEffect, useState } from "react";
import { getAllDepatrments } from "../services/DepartmentService";
import { Link } from "react-router-dom";

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

  useEffect(() => {
    getAllDepatrments()
      .then((response) => {
        console.log(response.data);
        setDepartments(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }, []);

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
          </tr>
        </thead>
        <tbody>
          {departments.map((department) => (
            <tr key={department.id}>
              <td>{department.id}</td>
              <td>{department.departmentName}</td>
              <td>{department.departmentDescription}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ListDepartmentComponent;
