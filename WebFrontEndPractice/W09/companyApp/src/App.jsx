// ./src/App.jsx
import { BrowserRouter } from 'react-router-dom'
import Navbar from './components/Navbar/Navbar';
import Footer from './components/Footer/Footer';

import { createBrowserRouter, RouterProvider, Outlet } from "react-router-dom";

import MainPage from "./pages/MainPage/MainPage";
import About from "./pages/About/About";
import Leadership from "./pages/Leadership/Leadership";
import Board from "./pages/Board/Board";
import Services from "./pages/Services/Services";
import Contact from "./pages/Contact/Contact";
function Layout() {
  return (
    <>
      <Navbar />
      <Outlet />
      <Footer />
    </>
  );
}

const router = createBrowserRouter([
  {
    path: "/",
    element: <Layout />,
    children: [
      {
        index: true,
        element: <MainPage />
      },
      {
        path: "/about",
        element: <About />,
      },
      {
        path: "/leadership",
        element: <Leadership />,
      },
      {
        path: "/board",
        element: <Board />,
      },
      {
        path: "/our-services",
        element: <Services />,
      },
      {
        path: "/contact",
        element: <Contact />,
      }
    ]
  }
])

function App() {
  return <RouterProvider router={router} />;
}

export default App;
