package kr.jeje.shopmall.dto;

import kr.jeje.shopmall.domain.entity.File;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
public class FileDto {
    private long id;
    private String origFilename;
    private String filename;
    private String filePath;

    public File toEntity(){
        File build = File.builder()
                .id(id)
                .origFilename(origFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
        return build;
    }

    @Builder
    public FileDto(Long id, String origFilename, String filename, String filePath){
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
