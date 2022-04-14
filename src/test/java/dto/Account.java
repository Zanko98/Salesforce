package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {
    String name,
            website,
            phone,
            billingCity,
            billingZipCode,
            billingStateCode,
            billingCountry,
            shippingCity,
            shippingZipCode,
            shippingState,
            shippingCountry,
            type,
            industry,
            description,
            billingStreet,
            shippingStreet;
}
