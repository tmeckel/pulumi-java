// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorFileFormatDescriptorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorS3SourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorS3SourceConfigArgs Empty = new AnomalyDetectorS3SourceConfigArgs();

    @InputImport(name="fileFormatDescriptor", required=true)
      private final Input<AnomalyDetectorFileFormatDescriptorArgs> fileFormatDescriptor;

    public Input<AnomalyDetectorFileFormatDescriptorArgs> getFileFormatDescriptor() {
        return this.fileFormatDescriptor;
    }

    @InputImport(name="historicalDataPathList")
      private final @Nullable Input<List<String>> historicalDataPathList;

    public Input<List<String>> getHistoricalDataPathList() {
        return this.historicalDataPathList == null ? Input.empty() : this.historicalDataPathList;
    }

    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="templatedPathList")
      private final @Nullable Input<List<String>> templatedPathList;

    public Input<List<String>> getTemplatedPathList() {
        return this.templatedPathList == null ? Input.empty() : this.templatedPathList;
    }

    public AnomalyDetectorS3SourceConfigArgs(
        Input<AnomalyDetectorFileFormatDescriptorArgs> fileFormatDescriptor,
        @Nullable Input<List<String>> historicalDataPathList,
        Input<String> roleArn,
        @Nullable Input<List<String>> templatedPathList) {
        this.fileFormatDescriptor = Objects.requireNonNull(fileFormatDescriptor, "expected parameter 'fileFormatDescriptor' to be non-null");
        this.historicalDataPathList = historicalDataPathList;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.templatedPathList = templatedPathList;
    }

    private AnomalyDetectorS3SourceConfigArgs() {
        this.fileFormatDescriptor = Input.empty();
        this.historicalDataPathList = Input.empty();
        this.roleArn = Input.empty();
        this.templatedPathList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorS3SourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnomalyDetectorFileFormatDescriptorArgs> fileFormatDescriptor;
        private @Nullable Input<List<String>> historicalDataPathList;
        private Input<String> roleArn;
        private @Nullable Input<List<String>> templatedPathList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorS3SourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileFormatDescriptor = defaults.fileFormatDescriptor;
    	      this.historicalDataPathList = defaults.historicalDataPathList;
    	      this.roleArn = defaults.roleArn;
    	      this.templatedPathList = defaults.templatedPathList;
        }

        public Builder fileFormatDescriptor(Input<AnomalyDetectorFileFormatDescriptorArgs> fileFormatDescriptor) {
            this.fileFormatDescriptor = Objects.requireNonNull(fileFormatDescriptor);
            return this;
        }

        public Builder fileFormatDescriptor(AnomalyDetectorFileFormatDescriptorArgs fileFormatDescriptor) {
            this.fileFormatDescriptor = Input.of(Objects.requireNonNull(fileFormatDescriptor));
            return this;
        }

        public Builder historicalDataPathList(@Nullable Input<List<String>> historicalDataPathList) {
            this.historicalDataPathList = historicalDataPathList;
            return this;
        }

        public Builder historicalDataPathList(@Nullable List<String> historicalDataPathList) {
            this.historicalDataPathList = Input.ofNullable(historicalDataPathList);
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder templatedPathList(@Nullable Input<List<String>> templatedPathList) {
            this.templatedPathList = templatedPathList;
            return this;
        }

        public Builder templatedPathList(@Nullable List<String> templatedPathList) {
            this.templatedPathList = Input.ofNullable(templatedPathList);
            return this;
        }
        public AnomalyDetectorS3SourceConfigArgs build() {
            return new AnomalyDetectorS3SourceConfigArgs(fileFormatDescriptor, historicalDataPathList, roleArn, templatedPathList);
        }
    }
}
