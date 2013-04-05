package com.project.transaction.impl;

import org.apache.log4j.Logger;

import com.project.business.bean.FileBean;
import com.project.business.exceptions.TestBusinessException;
import com.project.transaction.FileTransactionBo;

public class FileTransactionBoImpl implements FileTransactionBo {
	
	private static final Logger logger = Logger.getLogger(FileTransactionBoImpl.class);

	@Override
	public void saveFile(FileBean fileBean) throws TestBusinessException {
					
		if(fileBean!=null && fileBean.getName()==null){
			throw new TestBusinessException("fileBean.name is empty");
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("INIT - Save method");
		}		
		
		if(logger.isDebugEnabled()){
			logger.debug("TODO -- File object = '" + fileBean.getName() + "'");
			logger.debug("END - Save method");
		}		
	}
}