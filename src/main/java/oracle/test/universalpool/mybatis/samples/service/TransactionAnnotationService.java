package oracle.test.universalpool.mybatis.samples.service;

import oracle.test.universalpool.mybatis.samples.mappers.TransactionAnnotationDao;

/**
 * Created by iurii.dziuban on 28.07.2016.
 */

/**
 * Service that encapsulates Dao based on annotations
 */
public class TransactionAnnotationService {
    private TransactionAnnotationDao transactionAnnotationDao;

    public TransactionAnnotationDao getTransactionAnnotationDao() {
        return transactionAnnotationDao;
    }

    public void setTransactionAnnotationDao(TransactionAnnotationDao transactionAnnotationDao) {
        this.transactionAnnotationDao = transactionAnnotationDao;
    }
}
