package nl.fontys.s3.officereservationsystem.business.interfaces;


import nl.fontys.s3.officereservationsystem.domain.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TableService {
    void createTable(Table table);
    List<Table> getTablesByRoomId(Long roomId);
    Table getTableById(Long id);
    List<Table> getAllTables();


}
