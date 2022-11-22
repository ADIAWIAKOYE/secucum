package com.example.secucom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReponseMessage {

    private String contenu;

    private Boolean status;
}