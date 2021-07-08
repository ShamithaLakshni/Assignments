package com.vm.training.java.assignments;

public class Train {

		private int counter;
		private String pnr;
		private LocalDate travelDate;
		private Train train;
		static int count=1;
		private static TreeMap<Passenger,Integer> passengers=new TreeMap<Passenger,Integer>();
		
		public Ticket() {
			super();
		}

		public Ticket(LocalDate travelDate, Train train) {
			super();
			this.travelDate = travelDate;
			this.train = train;
		}

		static private String generatePNR()
		{
			
			return " BM_20170101_100";
		}
		
		private Double calcPassengerFare(Passenger passenger)
		{
	        
			
			return 0.0;
		}
		public void…
	[4:07 PM, 6/4/2021] Prem Kumar VM: package com.vm.bean;

import java.time.LocalDate;

public class Train {

		private int trainNo;
		private String trainName;
		private String source;
		private String destination;
		private Double ticketPrice;
		public Train(int trainNo, String trainName, String source, String destination, Double ticketPrice) {
			super();
			this.trainNo = trainNo;
			this.trainName = trainName;
			this.source = source;
			this.destination = destination;
			this.ticketPrice = ticketPrice;
		}
		public int getTrainNo() {
			return trainNo;
		}
		public void setTrainNo(int trainNo) {
			this.trainNo = trainNo;
		}
		public String getTrainName() {
			return trainName;
		}
		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public Double getTicketPrice() {
			return ticketPrice;
		}
		public void setTicketPrice(Double ticketPrice) {
			this.ticketPrice = ticketPrice;
		}
		@Override
		public String toString() {
			return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", source=" + source + ", destination="
					+ destination + ", ticketPrice=" + ticketPrice + "]";
		}
	}

}
