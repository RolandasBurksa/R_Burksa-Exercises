import { useEffect, useState } from "react";
import {
  getAllTodos,
  deleteTodo,
  completeTodo,
  inCompleteTodo,
} from "../services/TodoService";
import { useNavigate } from "react-router-dom";
import { isAdminUser } from "../services/AuthService";
// import axios from "axios";

const ListTodoComponent = () => {
  //   const dummyData = [
  //     {
  //       id: 1,
  //       title: "Learn core Java",
  //       description: "Learn Java with Examples",
  //       completed: false,
  //     },
  //     {
  //       id: 2,
  //       title: "Learn core Spting",
  //       description: "Learn Spring Core Examples",
  //       completed: false,
  //     },
  //     {
  //       id: 3,
  //       title: "Learn Boot Spting",
  //       description: "Learn Spring with Examples",
  //       completed: false,
  //     },
  //   ];

  //   const [todos, setTodos] = useState(dummyData);  <- Taip buvo kol tikrinome veikima

  const [todos, setTodos] = useState([]);

  const navigate = useNavigate();

  const isAdmin = isAdminUser();

  useEffect(() => {
    listTodos();
  }, []);

  function listTodos() {
    getAllTodos()
      .then((response) => {
        setTodos(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }

  function addNewTodo() {
    navigate("/add-todo");
  }

  function updateTodo(id) {
    console.log(id);
    navigate(`/update-todo/${id}`);
  }

  function removeTodo(id) {
    deleteTodo(id)
      .then((response) => {
        listTodos();
      })
      .catch((error) => {
        console.error(error);
      });
  }
  function markCompleteTodo(id) {
    completeTodo(id)
      .then((response) => {
        listTodos();
      })
      .catch((error) => {
        console.error(error);
      });
  }

  function markInCompleteTodo(id) {
    inCompleteTodo(id)
      .then((response) => {
        listTodos();
      })
      .catch((error) => {
        console.error(error);
      });
  }

  return (
    <div className="container">
      <h2 className="text-center">List of Todos</h2>
      {isAdmin && (
        <button className="btn btn-primary mb-2" onClick={addNewTodo}>
          Add Todo
        </button>
      )}

      <div>
        <table className="table table-bordered table-striped">
          <thead>
            <tr>
              <th>Todo Title</th>
              <th>Todo Description</th>
              <th>Todo Completed</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {todos.map((todo) => (
              <tr key={todo.id}>
                <td>{todo.title}</td>
                <td>{todo.description}</td>
                <td>{todo.completed ? "YES" : "NO"}</td>
                <td>
                  {isAdmin && (
                    <button
                      className="btn btn-info"
                      onClick={() => updateTodo(todo.id)}
                    >
                      Update
                    </button>
                  )}
                  {isAdmin && (
                    <button
                      className="btn btn-danger"
                      onClick={() => removeTodo(todo.id)}
                      style={{ marginLeft: "10px" }}
                    >
                      Delete
                    </button>
                  )}
                  <button
                    className="btn btn-success"
                    onClick={() => markCompleteTodo(todo.id)}
                    style={{ marginLeft: "10px" }}
                  >
                    Complete
                  </button>
                  <button
                    className="btn btn-info"
                    onClick={() => markInCompleteTodo(todo.id)}
                    style={{ marginLeft: "10px" }}
                  >
                    In Complete
                  </button>
                </td>
              </tr>
            ))}
            <tr></tr>
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default ListTodoComponent;
