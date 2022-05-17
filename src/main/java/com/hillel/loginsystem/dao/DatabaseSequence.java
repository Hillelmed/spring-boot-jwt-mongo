package com.hillel.loginsystem.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@NoArgsConstructor
public class DatabaseSequence {

    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private long seq;

}
