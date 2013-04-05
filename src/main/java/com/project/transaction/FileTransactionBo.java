package com.project.transaction;

import com.project.business.bean.FileBean;
import com.project.business.exceptions.TestBusinessException;
 
public interface FileTransactionBo{
 
	void saveFile(FileBean fileBean) throws TestBusinessException;
 
}