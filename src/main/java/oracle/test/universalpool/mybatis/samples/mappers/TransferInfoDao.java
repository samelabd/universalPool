package oracle.test.universalpool.mybatis.samples.mappers;


import java.util.List;

import oracle.test.universalpool.mybatis.samples.model.TransferInfo;


public interface TransferInfoDao {
	
	List<TransferInfo> findAll();
	List<TransferInfo> findAllByCateg();
	
	void insertTransferInfo(TransferInfo transferInfo);

}
