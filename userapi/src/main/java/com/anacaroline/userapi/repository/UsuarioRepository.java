package com.anacaroline.userapi.repository;

import com.anacaroline.userapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}