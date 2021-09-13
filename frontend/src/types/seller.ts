export type Seller = {
    id: number;
    name: String;


}

export type Sale = {

    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: number;
    seller: Seller;
      
}

export type SalePage = {
    content?:Sale[];
    last: boolean;
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;

}