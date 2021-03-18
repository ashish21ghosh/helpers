package helpers

type (
	File struct {
		Name string
		Path string
		Type FileType
	}

	FileType string

	FileExtension string
)

const (
	JSONFile FileType = "json"
	TextFile FileType = "text"
	CSVFile  FileType = "csv"
	TSVFile  FileType = "tsv"
)

const (
	JSONExt FileExtension = ".json"
	TextExt FileExtension = ".txt"
	CSVExt  FileExtension = ".csv"
	TSVExt  FileExtension = ".tsv"
)

var FileTypeExtMap = map[FileType]FileExtension{
	JSONFile: JSONExt,
	TextFile: TextExt,
	CSVFile:  CSVExt,
	TSVFile:  TSVExt,
}

func (t FileType) GetExtension() string {
	return string(FileTypeExtMap[t])
}
