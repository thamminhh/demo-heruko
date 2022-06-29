package com.example.demo_tss.repository;

import com.example.demo_tss.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
//    List<Ticket> findByTicketTypeId(int ticketTypeId);

    List<Ticket> findByMatchId(int ticketTypeId);
}
