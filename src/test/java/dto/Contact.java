package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Contact {
    String salutation,
            firstName,
            middleName,
            lastName,
            suffix,
            accountName,
            title,
            Department,
            email,
            fax,
            phone,
            mobile,
            mailingCountry,
            mailingCity,
            mailingZip,
            mailingStreet;
}
