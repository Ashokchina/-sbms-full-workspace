package ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ashokit.entity.Timings;

@Service
public interface TimingService {
List<Timings>getAllTimings();
}
