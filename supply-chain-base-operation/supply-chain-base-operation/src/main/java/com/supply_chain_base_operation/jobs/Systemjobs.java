package com.supply_chain_base_operation.jobs;

import com.supply_chain_base_operation.model.Operation;
import com.supply_chain_base_operation.repository.OperationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class Systemjobs {

    @Autowired
    private OperationRepository operationRepository;

    @Scheduled(fixedDelay = 60000)
        public void loadAllOperation() {

        log.info(" Sechudeled Jobs are triggered...");
            List<Operation> operations = List.of(
                    // ==================== PROCUREMENT ====================
                    Operation.builder().operationId("OP0001").operationName("CREATE_PROCUREMENT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0002").operationName("UPDATE_PROCUREMENT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0003").operationName("DELETE_PROCUREMENT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0004").operationName("VIEW_PROCUREMENT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0005").operationName("VIEW_ALL_PROCUREMENTS").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0006").operationName("APPROVE_PROCUREMENT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0007").operationName("REJECT_PROCUREMENT").operationCategory("PROCUREMENT").build(),

                    Operation.builder().operationId("OP0008").operationName("CREATE_PR").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0009").operationName("UPDATE_PR").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0010").operationName("DELETE_PR").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0011").operationName("VIEW_PR").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0012").operationName("VIEW_ALL_PRS").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0013").operationName("APPROVE_PR").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0014").operationName("REJECT_PR").operationCategory("PROCUREMENT").build(),

                    Operation.builder().operationId("OP0015").operationName("CREATE_RFQ").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0016").operationName("UPDATE_RFQ").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0017").operationName("DELETE_RFQ").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0018").operationName("VIEW_RFQ").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0019").operationName("VIEW_ALL_RFQS").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0020").operationName("PUBLISH_RFQ").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0021").operationName("CLOSE_RFQ").operationCategory("PROCUREMENT").build(),

                    Operation.builder().operationId("OP0022").operationName("CREATE_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0023").operationName("UPDATE_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0024").operationName("DELETE_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0025").operationName("VIEW_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0026").operationName("VIEW_ALL_CONTRACTS").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0027").operationName("APPROVE_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0028").operationName("RENEW_CONTRACT").operationCategory("PROCUREMENT").build(),
                    Operation.builder().operationId("OP0029").operationName("TERMINATE_CONTRACT").operationCategory("PROCUREMENT").build(),

                    // ==================== SUPPLIER ====================

                    Operation.builder().operationId("OP0030").operationName("CREATE_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0031").operationName("UPDATE_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0032").operationName("DELETE_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0033").operationName("VIEW_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0034").operationName("VIEW_ALL_SUPPLIERS").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0035").operationName("APPROVE_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0036").operationName("REJECT_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0037").operationName("BLOCK_SUPPLIER").operationCategory("SUPPLIER").build(),
                    Operation.builder().operationId("OP0038").operationName("UNBLOCK_SUPPLIER").operationCategory("SUPPLIER").build(),

                    // ==================== PURCHASE ORDER ====================

                    Operation.builder().operationId("OP0039").operationName("CREATE_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0040").operationName("UPDATE_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0041").operationName("DELETE_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0042").operationName("VIEW_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0043").operationName("VIEW_ALL_PURCHASE_ORDERS").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0044").operationName("APPROVE_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0045").operationName("REJECT_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),
                    Operation.builder().operationId("OP0046").operationName("CANCEL_PURCHASE_ORDER").operationCategory("PURCHASE_ORDER").build(),

                    // ==================== INVENTORY ====================

                    Operation.builder().operationId("OP0047").operationName("CREATE_STOCK").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0048").operationName("UPDATE_STOCK").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0049").operationName("DELETE_STOCK").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0050").operationName("VIEW_STOCK").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0051").operationName("VIEW_ALL_STOCK").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0052").operationName("STOCK_TRANSFER").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0053").operationName("STOCK_ADJUSTMENT").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0054").operationName("STOCK_RESERVATION").operationCategory("INVENTORY").build(),
                    Operation.builder().operationId("OP0055").operationName("STOCK_RELEASE").operationCategory("INVENTORY").build(),

                    // ==================== WAREHOUSE ====================

                    Operation.builder().operationId("OP0056").operationName("CREATE_WAREHOUSE").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0057").operationName("UPDATE_WAREHOUSE").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0058").operationName("DELETE_WAREHOUSE").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0059").operationName("VIEW_WAREHOUSE").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0060").operationName("VIEW_ALL_WAREHOUSES").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0061").operationName("RECEIVE_GOODS").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0062").operationName("PUT_AWAY").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0063").operationName("PICK_ORDER").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0064").operationName("PACK_ORDER").operationCategory("WAREHOUSE").build(),
                    Operation.builder().operationId("OP0065").operationName("DISPATCH_ORDER").operationCategory("WAREHOUSE").build(),

                    // ==================== LOGISTICS ====================

                    Operation.builder().operationId("OP0066").operationName("CREATE_SHIPMENT").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0067").operationName("UPDATE_SHIPMENT").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0068").operationName("DELETE_SHIPMENT").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0069").operationName("VIEW_SHIPMENT").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0070").operationName("VIEW_ALL_SHIPMENTS").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0071").operationName("SHIPMENT_PLANNING").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0072").operationName("CARRIER_ASSIGNMENT").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0073").operationName("SHIPMENT_DISPATCH").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0074").operationName("SHIPMENT_DELIVERY").operationCategory("LOGISTICS").build(),
                    Operation.builder().operationId("OP0075").operationName("DELIVERY_CONFIRMATION").operationCategory("LOGISTICS").build(),

                    // ==================== RETURNS ====================

                    Operation.builder().operationId("OP0076").operationName("CREATE_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0077").operationName("UPDATE_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0078").operationName("DELETE_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0079").operationName("VIEW_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0080").operationName("VIEW_ALL_RETURNS").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0081").operationName("APPROVE_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0082").operationName("REJECT_RETURN").operationCategory("RETURNS").build(),
                    Operation.builder().operationId("OP0083").operationName("RECEIVE_RETURN").operationCategory("RETURNS").build(),

                    // ==================== INVOICE ====================

                    Operation.builder().operationId("OP0084").operationName("CREATE_INVOICE").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0085").operationName("UPDATE_INVOICE").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0086").operationName("DELETE_INVOICE").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0087").operationName("VIEW_INVOICE").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0088").operationName("VIEW_ALL_INVOICES").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0089").operationName("VALIDATE_INVOICE").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0090").operationName("THREE_WAY_MATCH").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0091").operationName("APPROVE_INVOICE").operationCategory("FINANCE").build(),

                    // ==================== PAYMENT ====================

                    Operation.builder().operationId("OP0092").operationName("CREATE_PAYMENT").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0093").operationName("VIEW_PAYMENT").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0094").operationName("VIEW_ALL_PAYMENTS").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0095").operationName("PROCESS_PAYMENT").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0096").operationName("PAYMENT_COMPLETED").operationCategory("FINANCE").build(),
                    Operation.builder().operationId("OP0097").operationName("PAYMENT_FAILED").operationCategory("FINANCE").build()
            );

        log.info(" Operation is going to save the database .....");

            for (Operation operation:operations){

                if(operationRepository.findByOperationName(operation.getOperationName()) == null){
                    operationRepository.save(operation);
                }

            }


        log.info("Operation save Successfully....");




        }




}
