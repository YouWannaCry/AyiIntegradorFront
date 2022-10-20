package com.ayi.rest.serv.app.Integrador.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(
        value = "PersonaRequest",
        description = "Represents the data needed to create the emergency message"
)
public class PersonaRequest implements Serializable {

    @ApiModelProperty(position = 1, required = true, notes = "Name of the user")
    private String name;

    @ApiModelProperty(position = 2, notes = "User cellphone")
    private String cellphone;

    @NotNull(message = "Longitude can not be null")
    @ApiModelProperty(position = 3, notes = "Longitude cords")
    private Double longitude;

    @NotNull(message = "Latitude can not be null")
    @ApiModelProperty(position = 4, notes = "Latitude cords")
    private Double latitude;

    @NotNull(message = "Emergency contacts can not be null")
    @ApiModelProperty(position = 5, notes = "Emergency contacts list")
    private List<String> contacts;


}