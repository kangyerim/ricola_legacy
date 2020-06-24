package com.ricola_legacy.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PicnicDTO {
	private String stationName, stationType, roadAddress, branchAddress, latitude, hardness, operStart, operEnd, closeDay,
    chargeType, serviceCharge, holdingNum, holderNum, airInjectAble, airInjectType, repairAble, manageTel, manageAgency, dbDate;
}
