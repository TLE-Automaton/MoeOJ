package top.hcode.hoj.service.training;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.hcode.hoj.pojo.dto.TrainingDto;
import top.hcode.hoj.pojo.entity.training.Training;
import top.hcode.hoj.pojo.vo.TrainingVo;

public interface TrainingService extends IService<Training> {
    public IPage<TrainingVo> getTrainingList(int limit, int currentPage,
                                             Long categoryId, String auth, String keyword);

    public boolean addTraining(TrainingDto trainingDto);

    public boolean updateTraining(TrainingDto trainingDto);
}
