package com.sytem;

public class Transactional {
	
	
	// default is unchecked exp
	// for unchecked Exp no need to manually rollback is happen 
//	@Transactional
//	public void saveData() {
//	    repository.save(entity);
//	    if (someCondition) {
//	        throw new RuntimeException("Trigger rollback");
//	    }
//	}
	
	
//	 manually give for the checked exp  no rollback is happen by default 
//	@Transactional(rollbackFor = IOException.class)
//	public void saveData() throws IOException {
//	    repository.save(entity);
//	    throw new IOException("Now rollback will happen");
//	}




}
