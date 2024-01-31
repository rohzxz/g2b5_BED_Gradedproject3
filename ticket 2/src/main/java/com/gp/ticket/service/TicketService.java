package com.gp.ticket.service;

import java.util.List;

import com.gp.ticket.dto.TicketDto;

public interface TicketService {
	
	List<TicketDto> findAllTickets();
	
	void createTicket(TicketDto ticketDto);
	
	TicketDto findTickerById(Long ticketId);
	
	void updateTicket(TicketDto ticketDto);
	
	void deleteTicket(Long ticketId);

	TicketDto findTicketByUrl(String ticketUrl);
	
	List<TicketDto> searchTickets(String query);

}
