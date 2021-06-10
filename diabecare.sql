-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-06-2021 a las 13:20:27
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `diabecare`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentos`
--

CREATE TABLE `alimentos` (
  `id_alimento` bigint(20) NOT NULL,
  `carbohidratos` int(11) NOT NULL,
  `descripcion` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `alimentos`
--

INSERT INTO `alimentos` (`id_alimento`, `carbohidratos`, `descripcion`, `nombre`) VALUES
(1, 100, 'ola', 'ola');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicios`
--

CREATE TABLE `ejercicios` (
  `id_ejercicio` bigint(20) NOT NULL,
  `dificultad` int(11) NOT NULL,
  `ejercicio` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `ejercicio_descripcion` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `ejercicios`
--

INSERT INTO `ejercicios` (`id_ejercicio`, `dificultad`, `ejercicio`, `ejercicio_descripcion`) VALUES
(1, 1, 'a', 'a');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicios_diarios`
--

CREATE TABLE `ejercicios_diarios` (
  `id_ejercicios_diarios` bigint(20) NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `id_ejercicio1` int(11) NOT NULL,
  `id_ejercicio2` int(11) NOT NULL,
  `id_ejercicio3` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `ejercicios_diarios`
--

INSERT INTO `ejercicios_diarios` (`id_ejercicios_diarios`, `fecha`, `id_ejercicio1`, `id_ejercicio2`, `id_ejercicio3`) VALUES
(1, '2021-06-15 00:00:00.000000', 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mediciones`
--

CREATE TABLE `mediciones` (
  `idUsuario` int(11) NOT NULL,
  `medicion` int(11) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recetas`
--

CREATE TABLE `recetas` (
  `id_receta` bigint(20) NOT NULL,
  `alergenos` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `categoria` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `descripcion` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `imagen` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `recetas`
--

INSERT INTO `recetas` (`id_receta`, `alergenos`, `categoria`, `descripcion`, `imagen`, `nombre`) VALUES
(1, 'NO', 'x', 'no', 'no', 'no');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reminders`
--

CREATE TABLE `reminders` (
  `id_reminder` bigint(20) NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `id_usuario` bigint(20) DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `reminders`
--

INSERT INTO `reminders` (`id_reminder`, `fecha`, `id_usuario`, `nombre`) VALUES
(1, '2021-06-15 00:00:00.000000', 2, 'OLA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` bigint(20) NOT NULL,
  `altura` int(11) NOT NULL,
  `apellidos` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `indice_sensibilidad` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `peso` int(11) NOT NULL,
  `sexo` char(1) COLLATE utf32_spanish2_ci NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `altura`, `apellidos`, `email`, `fecha_nac`, `indice_sensibilidad`, `nombre`, `peso`, `sexo`, `telefono`) VALUES
(1, 170, 'Lopes', 'em@em.em', '2002-01-01', 6, 'ola', 60, 'F', 601002144),
(2, 172, 'Lopes', 'em@em.em', '2002-01-01', 6, 'ola', 60, 'F', 601002144);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  ADD PRIMARY KEY (`id_alimento`);

--
-- Indices de la tabla `ejercicios`
--
ALTER TABLE `ejercicios`
  ADD PRIMARY KEY (`id_ejercicio`);

--
-- Indices de la tabla `ejercicios_diarios`
--
ALTER TABLE `ejercicios_diarios`
  ADD PRIMARY KEY (`id_ejercicios_diarios`);

--
-- Indices de la tabla `recetas`
--
ALTER TABLE `recetas`
  ADD PRIMARY KEY (`id_receta`);

--
-- Indices de la tabla `reminders`
--
ALTER TABLE `reminders`
  ADD PRIMARY KEY (`id_reminder`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  MODIFY `id_alimento` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ejercicios`
--
ALTER TABLE `ejercicios`
  MODIFY `id_ejercicio` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ejercicios_diarios`
--
ALTER TABLE `ejercicios_diarios`
  MODIFY `id_ejercicios_diarios` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `recetas`
--
ALTER TABLE `recetas`
  MODIFY `id_receta` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `reminders`
--
ALTER TABLE `reminders`
  MODIFY `id_reminder` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
