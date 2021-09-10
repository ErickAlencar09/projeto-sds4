package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
		private static final long serialVersionUID = 1L;
		public String sellerName;
		public Double sum;
		private Long visited;
		private Long deals;
		
		public SaleSuccessDTO() {
			
		}

		

		public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
			super();
			sellerName = seller.getName();
			this.visited = visited;
			this.deals = deals;
		}



		public String getSellerName() {
			return sellerName;
		}

		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}

		public Double getSum() {
			return sum;
		}

		public void setSum(Double sum) {
			this.sum = sum;
		}



		public Long getVisited() {
			return visited;
		}



		public void setVisited(Long visited) {
			this.visited = visited;
		}



		public Long getDeals() {
			return deals;
		}



		public void setDeals(Long deals) {
			this.deals = deals;
		}



}
