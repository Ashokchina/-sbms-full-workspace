package ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Timings;
import ashokit.repository.TimingsRepository;
@Service
public class TimingsServiceImpl implements TimingService {
	@Autowired
private TimingsRepository timerepo;
	@Override
	public List<Timings> getAllTimings() {
		// TODO Auto-generated method stub
		return timerepo.findAll();
	}

}
