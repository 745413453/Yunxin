package com.yunxin.mapper;

import com.yunxin.entity.CaProduct;
import com.yunxin.entity.CaProductExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CaProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @SelectProvider(type=CaProductSqlProvider.class, method="countByExample")
    int countByExample(CaProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @DeleteProvider(type=CaProductSqlProvider.class, method="deleteByExample")
    int deleteByExample(CaProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Delete({
        "delete from CA_Product",
        "where ProductCode = #{productcode,jdbcType=NVARCHAR}"
    })
    int deleteByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Insert({
        "insert into CA_Product (ProductCode, ProductName, ",
        "InvestmentIndustry, IndustryDetail, ",
        "IsCycleLoan, PenaltyInterestComputing, ",
        "LoanInterestComputing, PenaltyInterest, ",
        "PledgeRemind, InterestRateType, ",
        "InterestType, PartnerCode, ",
        "CheckBRFrauds, DataCreateTime, ",
        "DataLastChangeTime, PaymentAccountNo, ",
        "PaymentChannel, PrefixLoanContractNumber, ",
        "IsNeedHandIDCardImage, IsNeedBankCardImage, ",
        "IsNeedEmail, IsNeedPlatProductName, ",
        "IsNeedLoanPurpose, IsNeedPlatRating, ",
        "IsNeedIDCardValidateDate, IsNeedEmergencyContact, ",
        "IsNeedMaritalInfo, IsNeedPledge, ",
        "IsNeedGuarantee, IsNeedEntrust, ",
        "RePayScheduleSource, IsRePayScheduleRegular, ",
        "IsNeedApprove, AdvanceDaysForAllRepay, ",
        "ApplyPaymentSouce, TrustAccoutNo, ",
        "BorrowerAgeBegin, BorrowerAgeEnd, ",
        "IsNeedChedk, SignMode, ",
        "IsNeedConsumptionContract, SealPage, ",
        "SealPositionX, SealPositionY, ",
        "LoanProductType, GuaranteeWay, ",
        "InvestmentSorts, BusinessSubdivided, ",
        "ContractTempleteFileId, GracePeriod, ",
        "BuyBackPeriod, ContractAmountLimit, ",
        "IsAuthorized, DeductChannel, ",
        "IsBankCardValidated, IsNeedCoBorrower, ",
        "Rong360CheckFrauds, PaymentMode, ",
        "TrustBankName, EnTrustPersonNeedFiles, ",
        "EnTrustCompanyNeedFiles, ContractSignInfo, ",
        "NeedFileTypesForMainContract, NeedFileTypesForSubloanContract, ",
        "MainContractSignType, SubContractSignType)",
        "values (#{productcode,jdbcType=NVARCHAR}, #{productname,jdbcType=NVARCHAR}, ",
        "#{investmentindustry,jdbcType=NVARCHAR}, #{industrydetail,jdbcType=NVARCHAR}, ",
        "#{iscycleloan,jdbcType=NVARCHAR}, #{penaltyinterestcomputing,jdbcType=NVARCHAR}, ",
        "#{loaninterestcomputing,jdbcType=NVARCHAR}, #{penaltyinterest,jdbcType=DECIMAL}, ",
        "#{pledgeremind,jdbcType=NVARCHAR}, #{interestratetype,jdbcType=NVARCHAR}, ",
        "#{interesttype,jdbcType=NVARCHAR}, #{partnercode,jdbcType=NVARCHAR}, ",
        "#{checkbrfrauds,jdbcType=VARCHAR}, #{datacreatetime,jdbcType=TIMESTAMP}, ",
        "#{datalastchangetime,jdbcType=TIMESTAMP}, #{paymentaccountno,jdbcType=VARCHAR}, ",
        "#{paymentchannel,jdbcType=INTEGER}, #{prefixloancontractnumber,jdbcType=VARCHAR}, ",
        "#{isneedhandidcardimage,jdbcType=INTEGER}, #{isneedbankcardimage,jdbcType=INTEGER}, ",
        "#{isneedemail,jdbcType=INTEGER}, #{isneedplatproductname,jdbcType=INTEGER}, ",
        "#{isneedloanpurpose,jdbcType=INTEGER}, #{isneedplatrating,jdbcType=INTEGER}, ",
        "#{isneedidcardvalidatedate,jdbcType=INTEGER}, #{isneedemergencycontact,jdbcType=INTEGER}, ",
        "#{isneedmaritalinfo,jdbcType=INTEGER}, #{isneedpledge,jdbcType=INTEGER}, ",
        "#{isneedguarantee,jdbcType=INTEGER}, #{isneedentrust,jdbcType=INTEGER}, ",
        "#{repayschedulesource,jdbcType=NVARCHAR}, #{isrepayscheduleregular,jdbcType=INTEGER}, ",
        "#{isneedapprove,jdbcType=INTEGER}, #{advancedaysforallrepay,jdbcType=INTEGER}, ",
        "#{applypaymentsouce,jdbcType=INTEGER}, #{trustaccoutno,jdbcType=VARCHAR}, ",
        "#{borroweragebegin,jdbcType=INTEGER}, #{borrowerageend,jdbcType=INTEGER}, ",
        "#{isneedchedk,jdbcType=INTEGER}, #{signmode,jdbcType=INTEGER}, ",
        "#{isneedconsumptioncontract,jdbcType=INTEGER}, #{sealpage,jdbcType=INTEGER}, ",
        "#{sealpositionx,jdbcType=INTEGER}, #{sealpositiony,jdbcType=INTEGER}, ",
        "#{loanproducttype,jdbcType=NVARCHAR}, #{guaranteeway,jdbcType=NVARCHAR}, ",
        "#{investmentsorts,jdbcType=NVARCHAR}, #{businesssubdivided,jdbcType=NVARCHAR}, ",
        "#{contracttempletefileid,jdbcType=VARCHAR}, #{graceperiod,jdbcType=INTEGER}, ",
        "#{buybackperiod,jdbcType=INTEGER}, #{contractamountlimit,jdbcType=DECIMAL}, ",
        "#{isauthorized,jdbcType=INTEGER}, #{deductchannel,jdbcType=INTEGER}, ",
        "#{isbankcardvalidated,jdbcType=INTEGER}, #{isneedcoborrower,jdbcType=INTEGER}, ",
        "#{rong360checkfrauds,jdbcType=VARCHAR}, #{paymentmode,jdbcType=INTEGER}, ",
        "#{trustbankname,jdbcType=NVARCHAR}, #{entrustpersonneedfiles,jdbcType=VARCHAR}, ",
        "#{entrustcompanyneedfiles,jdbcType=VARCHAR}, #{contractsigninfo,jdbcType=VARCHAR}, ",
        "#{needfiletypesformaincontract,jdbcType=VARCHAR}, #{needfiletypesforsubloancontract,jdbcType=VARCHAR}, ",
        "#{maincontractsigntype,jdbcType=VARCHAR}, #{subcontractsigntype,jdbcType=VARCHAR})"
    })
    int insert(CaProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @InsertProvider(type=CaProductSqlProvider.class, method="insertSelective")
    int insertSelective(CaProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @SelectProvider(type=CaProductSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ProductCode", property="productcode", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="ProductName", property="productname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InvestmentIndustry", property="investmentindustry", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IndustryDetail", property="industrydetail", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IsCycleLoan", property="iscycleloan", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PenaltyInterestComputing", property="penaltyinterestcomputing", jdbcType=JdbcType.NVARCHAR),
        @Result(column="LoanInterestComputing", property="loaninterestcomputing", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PenaltyInterest", property="penaltyinterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="PledgeRemind", property="pledgeremind", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InterestRateType", property="interestratetype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InterestType", property="interesttype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PartnerCode", property="partnercode", jdbcType=JdbcType.NVARCHAR),
        @Result(column="CheckBRFrauds", property="checkbrfrauds", jdbcType=JdbcType.VARCHAR),
        @Result(column="DataCreateTime", property="datacreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DataLastChangeTime", property="datalastchangetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PaymentAccountNo", property="paymentaccountno", jdbcType=JdbcType.VARCHAR),
        @Result(column="PaymentChannel", property="paymentchannel", jdbcType=JdbcType.INTEGER),
        @Result(column="PrefixLoanContractNumber", property="prefixloancontractnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="IsNeedHandIDCardImage", property="isneedhandidcardimage", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedBankCardImage", property="isneedbankcardimage", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEmail", property="isneedemail", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPlatProductName", property="isneedplatproductname", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedLoanPurpose", property="isneedloanpurpose", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPlatRating", property="isneedplatrating", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedIDCardValidateDate", property="isneedidcardvalidatedate", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEmergencyContact", property="isneedemergencycontact", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedMaritalInfo", property="isneedmaritalinfo", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPledge", property="isneedpledge", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedGuarantee", property="isneedguarantee", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEntrust", property="isneedentrust", jdbcType=JdbcType.INTEGER),
        @Result(column="RePayScheduleSource", property="repayschedulesource", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IsRePayScheduleRegular", property="isrepayscheduleregular", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedApprove", property="isneedapprove", jdbcType=JdbcType.INTEGER),
        @Result(column="AdvanceDaysForAllRepay", property="advancedaysforallrepay", jdbcType=JdbcType.INTEGER),
        @Result(column="ApplyPaymentSouce", property="applypaymentsouce", jdbcType=JdbcType.INTEGER),
        @Result(column="TrustAccoutNo", property="trustaccoutno", jdbcType=JdbcType.VARCHAR),
        @Result(column="BorrowerAgeBegin", property="borroweragebegin", jdbcType=JdbcType.INTEGER),
        @Result(column="BorrowerAgeEnd", property="borrowerageend", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedChedk", property="isneedchedk", jdbcType=JdbcType.INTEGER),
        @Result(column="SignMode", property="signmode", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedConsumptionContract", property="isneedconsumptioncontract", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPage", property="sealpage", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPositionX", property="sealpositionx", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPositionY", property="sealpositiony", jdbcType=JdbcType.INTEGER),
        @Result(column="LoanProductType", property="loanproducttype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="GuaranteeWay", property="guaranteeway", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InvestmentSorts", property="investmentsorts", jdbcType=JdbcType.NVARCHAR),
        @Result(column="BusinessSubdivided", property="businesssubdivided", jdbcType=JdbcType.NVARCHAR),
        @Result(column="ContractTempleteFileId", property="contracttempletefileid", jdbcType=JdbcType.VARCHAR),
        @Result(column="GracePeriod", property="graceperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="BuyBackPeriod", property="buybackperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="ContractAmountLimit", property="contractamountlimit", jdbcType=JdbcType.DECIMAL),
        @Result(column="IsAuthorized", property="isauthorized", jdbcType=JdbcType.INTEGER),
        @Result(column="DeductChannel", property="deductchannel", jdbcType=JdbcType.INTEGER),
        @Result(column="IsBankCardValidated", property="isbankcardvalidated", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedCoBorrower", property="isneedcoborrower", jdbcType=JdbcType.INTEGER),
        @Result(column="Rong360CheckFrauds", property="rong360checkfrauds", jdbcType=JdbcType.VARCHAR),
        @Result(column="PaymentMode", property="paymentmode", jdbcType=JdbcType.INTEGER),
        @Result(column="TrustBankName", property="trustbankname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="EnTrustPersonNeedFiles", property="entrustpersonneedfiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="EnTrustCompanyNeedFiles", property="entrustcompanyneedfiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="ContractSignInfo", property="contractsigninfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="NeedFileTypesForMainContract", property="needfiletypesformaincontract", jdbcType=JdbcType.VARCHAR),
        @Result(column="NeedFileTypesForSubloanContract", property="needfiletypesforsubloancontract", jdbcType=JdbcType.VARCHAR),
        @Result(column="MainContractSignType", property="maincontractsigntype", jdbcType=JdbcType.VARCHAR),
        @Result(column="SubContractSignType", property="subcontractsigntype", jdbcType=JdbcType.VARCHAR)
    })
    List<CaProduct> selectByExample(CaProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Select({
        "select",
        "ProductCode, ProductName, InvestmentIndustry, IndustryDetail, IsCycleLoan, PenaltyInterestComputing, ",
        "LoanInterestComputing, PenaltyInterest, PledgeRemind, InterestRateType, InterestType, ",
        "PartnerCode, CheckBRFrauds, DataCreateTime, DataLastChangeTime, PaymentAccountNo, ",
        "PaymentChannel, PrefixLoanContractNumber, IsNeedHandIDCardImage, IsNeedBankCardImage, ",
        "IsNeedEmail, IsNeedPlatProductName, IsNeedLoanPurpose, IsNeedPlatRating, IsNeedIDCardValidateDate, ",
        "IsNeedEmergencyContact, IsNeedMaritalInfo, IsNeedPledge, IsNeedGuarantee, IsNeedEntrust, ",
        "RePayScheduleSource, IsRePayScheduleRegular, IsNeedApprove, AdvanceDaysForAllRepay, ",
        "ApplyPaymentSouce, TrustAccoutNo, BorrowerAgeBegin, BorrowerAgeEnd, IsNeedChedk, ",
        "SignMode, IsNeedConsumptionContract, SealPage, SealPositionX, SealPositionY, ",
        "LoanProductType, GuaranteeWay, InvestmentSorts, BusinessSubdivided, ContractTempleteFileId, ",
        "GracePeriod, BuyBackPeriod, ContractAmountLimit, IsAuthorized, DeductChannel, ",
        "IsBankCardValidated, IsNeedCoBorrower, Rong360CheckFrauds, PaymentMode, TrustBankName, ",
        "EnTrustPersonNeedFiles, EnTrustCompanyNeedFiles, ContractSignInfo, NeedFileTypesForMainContract, ",
        "NeedFileTypesForSubloanContract, MainContractSignType, SubContractSignType",
        "from CA_Product",
        "where ProductCode = #{productcode,jdbcType=NVARCHAR}"
    })
    @Results({
        @Result(column="ProductCode", property="productcode", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="ProductName", property="productname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InvestmentIndustry", property="investmentindustry", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IndustryDetail", property="industrydetail", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IsCycleLoan", property="iscycleloan", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PenaltyInterestComputing", property="penaltyinterestcomputing", jdbcType=JdbcType.NVARCHAR),
        @Result(column="LoanInterestComputing", property="loaninterestcomputing", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PenaltyInterest", property="penaltyinterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="PledgeRemind", property="pledgeremind", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InterestRateType", property="interestratetype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InterestType", property="interesttype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PartnerCode", property="partnercode", jdbcType=JdbcType.NVARCHAR),
        @Result(column="CheckBRFrauds", property="checkbrfrauds", jdbcType=JdbcType.VARCHAR),
        @Result(column="DataCreateTime", property="datacreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DataLastChangeTime", property="datalastchangetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PaymentAccountNo", property="paymentaccountno", jdbcType=JdbcType.VARCHAR),
        @Result(column="PaymentChannel", property="paymentchannel", jdbcType=JdbcType.INTEGER),
        @Result(column="PrefixLoanContractNumber", property="prefixloancontractnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="IsNeedHandIDCardImage", property="isneedhandidcardimage", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedBankCardImage", property="isneedbankcardimage", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEmail", property="isneedemail", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPlatProductName", property="isneedplatproductname", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedLoanPurpose", property="isneedloanpurpose", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPlatRating", property="isneedplatrating", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedIDCardValidateDate", property="isneedidcardvalidatedate", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEmergencyContact", property="isneedemergencycontact", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedMaritalInfo", property="isneedmaritalinfo", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedPledge", property="isneedpledge", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedGuarantee", property="isneedguarantee", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedEntrust", property="isneedentrust", jdbcType=JdbcType.INTEGER),
        @Result(column="RePayScheduleSource", property="repayschedulesource", jdbcType=JdbcType.NVARCHAR),
        @Result(column="IsRePayScheduleRegular", property="isrepayscheduleregular", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedApprove", property="isneedapprove", jdbcType=JdbcType.INTEGER),
        @Result(column="AdvanceDaysForAllRepay", property="advancedaysforallrepay", jdbcType=JdbcType.INTEGER),
        @Result(column="ApplyPaymentSouce", property="applypaymentsouce", jdbcType=JdbcType.INTEGER),
        @Result(column="TrustAccoutNo", property="trustaccoutno", jdbcType=JdbcType.VARCHAR),
        @Result(column="BorrowerAgeBegin", property="borroweragebegin", jdbcType=JdbcType.INTEGER),
        @Result(column="BorrowerAgeEnd", property="borrowerageend", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedChedk", property="isneedchedk", jdbcType=JdbcType.INTEGER),
        @Result(column="SignMode", property="signmode", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedConsumptionContract", property="isneedconsumptioncontract", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPage", property="sealpage", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPositionX", property="sealpositionx", jdbcType=JdbcType.INTEGER),
        @Result(column="SealPositionY", property="sealpositiony", jdbcType=JdbcType.INTEGER),
        @Result(column="LoanProductType", property="loanproducttype", jdbcType=JdbcType.NVARCHAR),
        @Result(column="GuaranteeWay", property="guaranteeway", jdbcType=JdbcType.NVARCHAR),
        @Result(column="InvestmentSorts", property="investmentsorts", jdbcType=JdbcType.NVARCHAR),
        @Result(column="BusinessSubdivided", property="businesssubdivided", jdbcType=JdbcType.NVARCHAR),
        @Result(column="ContractTempleteFileId", property="contracttempletefileid", jdbcType=JdbcType.VARCHAR),
        @Result(column="GracePeriod", property="graceperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="BuyBackPeriod", property="buybackperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="ContractAmountLimit", property="contractamountlimit", jdbcType=JdbcType.DECIMAL),
        @Result(column="IsAuthorized", property="isauthorized", jdbcType=JdbcType.INTEGER),
        @Result(column="DeductChannel", property="deductchannel", jdbcType=JdbcType.INTEGER),
        @Result(column="IsBankCardValidated", property="isbankcardvalidated", jdbcType=JdbcType.INTEGER),
        @Result(column="IsNeedCoBorrower", property="isneedcoborrower", jdbcType=JdbcType.INTEGER),
        @Result(column="Rong360CheckFrauds", property="rong360checkfrauds", jdbcType=JdbcType.VARCHAR),
        @Result(column="PaymentMode", property="paymentmode", jdbcType=JdbcType.INTEGER),
        @Result(column="TrustBankName", property="trustbankname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="EnTrustPersonNeedFiles", property="entrustpersonneedfiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="EnTrustCompanyNeedFiles", property="entrustcompanyneedfiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="ContractSignInfo", property="contractsigninfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="NeedFileTypesForMainContract", property="needfiletypesformaincontract", jdbcType=JdbcType.VARCHAR),
        @Result(column="NeedFileTypesForSubloanContract", property="needfiletypesforsubloancontract", jdbcType=JdbcType.VARCHAR),
        @Result(column="MainContractSignType", property="maincontractsigntype", jdbcType=JdbcType.VARCHAR),
        @Result(column="SubContractSignType", property="subcontractsigntype", jdbcType=JdbcType.VARCHAR)
    })
    CaProduct selectByPrimaryKey(String productcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaProductSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CaProduct record, @Param("example") CaProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaProductSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CaProduct record, @Param("example") CaProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CaProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Product
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Update({
        "update CA_Product",
        "set ProductName = #{productname,jdbcType=NVARCHAR},",
          "InvestmentIndustry = #{investmentindustry,jdbcType=NVARCHAR},",
          "IndustryDetail = #{industrydetail,jdbcType=NVARCHAR},",
          "IsCycleLoan = #{iscycleloan,jdbcType=NVARCHAR},",
          "PenaltyInterestComputing = #{penaltyinterestcomputing,jdbcType=NVARCHAR},",
          "LoanInterestComputing = #{loaninterestcomputing,jdbcType=NVARCHAR},",
          "PenaltyInterest = #{penaltyinterest,jdbcType=DECIMAL},",
          "PledgeRemind = #{pledgeremind,jdbcType=NVARCHAR},",
          "InterestRateType = #{interestratetype,jdbcType=NVARCHAR},",
          "InterestType = #{interesttype,jdbcType=NVARCHAR},",
          "PartnerCode = #{partnercode,jdbcType=NVARCHAR},",
          "CheckBRFrauds = #{checkbrfrauds,jdbcType=VARCHAR},",
          "DataCreateTime = #{datacreatetime,jdbcType=TIMESTAMP},",
          "DataLastChangeTime = #{datalastchangetime,jdbcType=TIMESTAMP},",
          "PaymentAccountNo = #{paymentaccountno,jdbcType=VARCHAR},",
          "PaymentChannel = #{paymentchannel,jdbcType=INTEGER},",
          "PrefixLoanContractNumber = #{prefixloancontractnumber,jdbcType=VARCHAR},",
          "IsNeedHandIDCardImage = #{isneedhandidcardimage,jdbcType=INTEGER},",
          "IsNeedBankCardImage = #{isneedbankcardimage,jdbcType=INTEGER},",
          "IsNeedEmail = #{isneedemail,jdbcType=INTEGER},",
          "IsNeedPlatProductName = #{isneedplatproductname,jdbcType=INTEGER},",
          "IsNeedLoanPurpose = #{isneedloanpurpose,jdbcType=INTEGER},",
          "IsNeedPlatRating = #{isneedplatrating,jdbcType=INTEGER},",
          "IsNeedIDCardValidateDate = #{isneedidcardvalidatedate,jdbcType=INTEGER},",
          "IsNeedEmergencyContact = #{isneedemergencycontact,jdbcType=INTEGER},",
          "IsNeedMaritalInfo = #{isneedmaritalinfo,jdbcType=INTEGER},",
          "IsNeedPledge = #{isneedpledge,jdbcType=INTEGER},",
          "IsNeedGuarantee = #{isneedguarantee,jdbcType=INTEGER},",
          "IsNeedEntrust = #{isneedentrust,jdbcType=INTEGER},",
          "RePayScheduleSource = #{repayschedulesource,jdbcType=NVARCHAR},",
          "IsRePayScheduleRegular = #{isrepayscheduleregular,jdbcType=INTEGER},",
          "IsNeedApprove = #{isneedapprove,jdbcType=INTEGER},",
          "AdvanceDaysForAllRepay = #{advancedaysforallrepay,jdbcType=INTEGER},",
          "ApplyPaymentSouce = #{applypaymentsouce,jdbcType=INTEGER},",
          "TrustAccoutNo = #{trustaccoutno,jdbcType=VARCHAR},",
          "BorrowerAgeBegin = #{borroweragebegin,jdbcType=INTEGER},",
          "BorrowerAgeEnd = #{borrowerageend,jdbcType=INTEGER},",
          "IsNeedChedk = #{isneedchedk,jdbcType=INTEGER},",
          "SignMode = #{signmode,jdbcType=INTEGER},",
          "IsNeedConsumptionContract = #{isneedconsumptioncontract,jdbcType=INTEGER},",
          "SealPage = #{sealpage,jdbcType=INTEGER},",
          "SealPositionX = #{sealpositionx,jdbcType=INTEGER},",
          "SealPositionY = #{sealpositiony,jdbcType=INTEGER},",
          "LoanProductType = #{loanproducttype,jdbcType=NVARCHAR},",
          "GuaranteeWay = #{guaranteeway,jdbcType=NVARCHAR},",
          "InvestmentSorts = #{investmentsorts,jdbcType=NVARCHAR},",
          "BusinessSubdivided = #{businesssubdivided,jdbcType=NVARCHAR},",
          "ContractTempleteFileId = #{contracttempletefileid,jdbcType=VARCHAR},",
          "GracePeriod = #{graceperiod,jdbcType=INTEGER},",
          "BuyBackPeriod = #{buybackperiod,jdbcType=INTEGER},",
          "ContractAmountLimit = #{contractamountlimit,jdbcType=DECIMAL},",
          "IsAuthorized = #{isauthorized,jdbcType=INTEGER},",
          "DeductChannel = #{deductchannel,jdbcType=INTEGER},",
          "IsBankCardValidated = #{isbankcardvalidated,jdbcType=INTEGER},",
          "IsNeedCoBorrower = #{isneedcoborrower,jdbcType=INTEGER},",
          "Rong360CheckFrauds = #{rong360checkfrauds,jdbcType=VARCHAR},",
          "PaymentMode = #{paymentmode,jdbcType=INTEGER},",
          "TrustBankName = #{trustbankname,jdbcType=NVARCHAR},",
          "EnTrustPersonNeedFiles = #{entrustpersonneedfiles,jdbcType=VARCHAR},",
          "EnTrustCompanyNeedFiles = #{entrustcompanyneedfiles,jdbcType=VARCHAR},",
          "ContractSignInfo = #{contractsigninfo,jdbcType=VARCHAR},",
          "NeedFileTypesForMainContract = #{needfiletypesformaincontract,jdbcType=VARCHAR},",
          "NeedFileTypesForSubloanContract = #{needfiletypesforsubloancontract,jdbcType=VARCHAR},",
          "MainContractSignType = #{maincontractsigntype,jdbcType=VARCHAR},",
          "SubContractSignType = #{subcontractsigntype,jdbcType=VARCHAR}",
        "where ProductCode = #{productcode,jdbcType=NVARCHAR}"
    })
    int updateByPrimaryKey(CaProduct record);
}