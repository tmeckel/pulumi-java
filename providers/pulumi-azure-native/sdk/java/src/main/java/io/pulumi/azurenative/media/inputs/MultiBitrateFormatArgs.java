// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.OutputFileArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a collection of GOP aligned multi-bitrate files. The default behavior is to produce one output file for each video layer which is muxed together with all the audios. The exact output files produced can be controlled by specifying the outputFiles collection.
 * 
 */
public final class MultiBitrateFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiBitrateFormatArgs Empty = new MultiBitrateFormatArgs();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @Import(name="filenamePattern", required=true)
      private final Output<String> filenamePattern;

    public Output<String> getFilenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MultiBitrateFormat'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @Import(name="outputFiles")
      private final @Nullable Output<List<OutputFileArgs>> outputFiles;

    public Output<List<OutputFileArgs>> getOutputFiles() {
        return this.outputFiles == null ? Codegen.empty() : this.outputFiles;
    }

    public MultiBitrateFormatArgs(
        Output<String> filenamePattern,
        Output<String> odataType,
        @Nullable Output<List<OutputFileArgs>> outputFiles) {
        this.filenamePattern = Objects.requireNonNull(filenamePattern, "expected parameter 'filenamePattern' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.outputFiles = outputFiles;
    }

    private MultiBitrateFormatArgs() {
        this.filenamePattern = Codegen.empty();
        this.odataType = Codegen.empty();
        this.outputFiles = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiBitrateFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> filenamePattern;
        private Output<String> odataType;
        private @Nullable Output<List<OutputFileArgs>> outputFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiBitrateFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.odataType = defaults.odataType;
    	      this.outputFiles = defaults.outputFiles;
        }

        public Builder filenamePattern(Output<String> filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }
        public Builder filenamePattern(String filenamePattern) {
            this.filenamePattern = Output.of(Objects.requireNonNull(filenamePattern));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder outputFiles(@Nullable Output<List<OutputFileArgs>> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }
        public Builder outputFiles(@Nullable List<OutputFileArgs> outputFiles) {
            this.outputFiles = Codegen.ofNullable(outputFiles);
            return this;
        }
        public Builder outputFiles(OutputFileArgs... outputFiles) {
            return outputFiles(List.of(outputFiles));
        }        public MultiBitrateFormatArgs build() {
            return new MultiBitrateFormatArgs(filenamePattern, odataType, outputFiles);
        }
    }
}
