package org.zerock.store;

import lombok.*;


@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class StoreDTO {

    private String name;
    private double lat,lng;
    private String menu;
    private double score;

}