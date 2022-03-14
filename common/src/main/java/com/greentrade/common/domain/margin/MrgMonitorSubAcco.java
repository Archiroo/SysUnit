package com.greentrade.common.domain.margin;

import java.math.BigDecimal;
import java.util.Date;

public class MrgMonitorSubAcco {

    private Integer Id;
    private Integer SubAccoCd;
    private BigDecimal BeginRtt;
    private Integer InsertType;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;

    private String SubAccoNo;
    private String CustName;
    private String ProductCode;
    private String ProductName;
    private BigDecimal RttWarningRate;
    private BigDecimal RttCallRate;
    private BigDecimal DepositAmt; //	-- Số dư cọc
    private BigDecimal TotalLoanAmt; //	-- Giải ngân
    private BigDecimal TotalInterestAmt; //	-- Hold lãi vay
    private BigDecimal TotalSecVal; //	-- Tổng GT danh mục
    private BigDecimal ProfitAmt; //	-- Lãi lỗ
    private BigDecimal Nav; //	-- NAV
    private BigDecimal DepositRequiredAmt; //	-- Cọc YC
    private BigDecimal Rtt; //	-- Rtt
    private BigDecimal DepositeAvailAmt; //	-- Cọc khả dụng
    private BigDecimal WithdrawAvailAmt; //	-- Có thể rút,
    private Integer Status; //-- 1.An toàn, 2.Cảnh báo, 3.Giải chấp
    private Date UpdatedTime; // Cập nhật cuối

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(Integer subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public BigDecimal getBeginRtt() {
        return BeginRtt;
    }

    public void setBeginRtt(BigDecimal beginRtt) {
        BeginRtt = beginRtt;
    }

    public Integer getInsertType() {
        return InsertType;
    }

    public void setInsertType(Integer insertType) {
        InsertType = insertType;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getCreatedUserId() {
        return CreatedUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        CreatedUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public String getUpdatedUserId() {
        return UpdatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        UpdatedUserId = updatedUserId;
    }

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public BigDecimal getRttWarningRate() {
        return RttWarningRate;
    }

    public void setRttWarningRate(BigDecimal rttWarningRate) {
        RttWarningRate = rttWarningRate;
    }

    public BigDecimal getRttCallRate() {
        return RttCallRate;
    }

    public void setRttCallRate(BigDecimal rttCallRate) {
        RttCallRate = rttCallRate;
    }

    public BigDecimal getDepositAmt() {
        return DepositAmt;
    }

    public void setDepositAmt(BigDecimal depositAmt) {
        DepositAmt = depositAmt;
    }

    public BigDecimal getTotalLoanAmt() {
        return TotalLoanAmt;
    }

    public void setTotalLoanAmt(BigDecimal totalLoanAmt) {
        TotalLoanAmt = totalLoanAmt;
    }

    public BigDecimal getTotalInterestAmt() {
        return TotalInterestAmt;
    }

    public void setTotalInterestAmt(BigDecimal totalInterestAmt) {
        TotalInterestAmt = totalInterestAmt;
    }

    public BigDecimal getTotalSecVal() {
        return TotalSecVal;
    }

    public void setTotalSecVal(BigDecimal totalSecVal) {
        TotalSecVal = totalSecVal;
    }

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }

    public BigDecimal getNav() {
        return Nav;
    }

    public void setNav(BigDecimal nav) {
        Nav = nav;
    }

    public BigDecimal getDepositRequiredAmt() {
        return DepositRequiredAmt;
    }

    public void setDepositRequiredAmt(BigDecimal depositRequiredAmt) {
        DepositRequiredAmt = depositRequiredAmt;
    }

    public BigDecimal getRtt() {
        return Rtt;
    }

    public void setRtt(BigDecimal rtt) {
        Rtt = rtt;
    }

    public BigDecimal getDepositeAvailAmt() {
        return DepositeAvailAmt;
    }

    public void setDepositeAvailAmt(BigDecimal depositeAvailAmt) {
        DepositeAvailAmt = depositeAvailAmt;
    }

    public BigDecimal getWithdrawAvailAmt() {
        return WithdrawAvailAmt;
    }

    public void setWithdrawAvailAmt(BigDecimal withdrawAvailAmt) {
        WithdrawAvailAmt = withdrawAvailAmt;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
