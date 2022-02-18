// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.BigQueryIODetailsResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.BigTableIODetailsResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.DatastoreIODetailsResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.FileIODetailsResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.PubSubIODetailsResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.SdkVersionResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.SpannerIODetailsResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobMetadataResponse {
    /**
     * Identification of a Cloud Bigtable source used in the Dataflow job.
     * 
     */
    private final List<BigTableIODetailsResponse> bigTableDetails;
    /**
     * Identification of a BigQuery source used in the Dataflow job.
     * 
     */
    private final List<BigQueryIODetailsResponse> bigqueryDetails;
    /**
     * Identification of a Datastore source used in the Dataflow job.
     * 
     */
    private final List<DatastoreIODetailsResponse> datastoreDetails;
    /**
     * Identification of a File source used in the Dataflow job.
     * 
     */
    private final List<FileIODetailsResponse> fileDetails;
    /**
     * Identification of a Pub/Sub source used in the Dataflow job.
     * 
     */
    private final List<PubSubIODetailsResponse> pubsubDetails;
    /**
     * The SDK version used to run the job.
     * 
     */
    private final SdkVersionResponse sdkVersion;
    /**
     * Identification of a Spanner source used in the Dataflow job.
     * 
     */
    private final List<SpannerIODetailsResponse> spannerDetails;

    @OutputCustomType.Constructor({"bigTableDetails","bigqueryDetails","datastoreDetails","fileDetails","pubsubDetails","sdkVersion","spannerDetails"})
    private JobMetadataResponse(
        List<BigTableIODetailsResponse> bigTableDetails,
        List<BigQueryIODetailsResponse> bigqueryDetails,
        List<DatastoreIODetailsResponse> datastoreDetails,
        List<FileIODetailsResponse> fileDetails,
        List<PubSubIODetailsResponse> pubsubDetails,
        SdkVersionResponse sdkVersion,
        List<SpannerIODetailsResponse> spannerDetails) {
        this.bigTableDetails = Objects.requireNonNull(bigTableDetails);
        this.bigqueryDetails = Objects.requireNonNull(bigqueryDetails);
        this.datastoreDetails = Objects.requireNonNull(datastoreDetails);
        this.fileDetails = Objects.requireNonNull(fileDetails);
        this.pubsubDetails = Objects.requireNonNull(pubsubDetails);
        this.sdkVersion = Objects.requireNonNull(sdkVersion);
        this.spannerDetails = Objects.requireNonNull(spannerDetails);
    }

    /**
     * Identification of a Cloud Bigtable source used in the Dataflow job.
     * 
     */
    public List<BigTableIODetailsResponse> getBigTableDetails() {
        return this.bigTableDetails;
    }
    /**
     * Identification of a BigQuery source used in the Dataflow job.
     * 
     */
    public List<BigQueryIODetailsResponse> getBigqueryDetails() {
        return this.bigqueryDetails;
    }
    /**
     * Identification of a Datastore source used in the Dataflow job.
     * 
     */
    public List<DatastoreIODetailsResponse> getDatastoreDetails() {
        return this.datastoreDetails;
    }
    /**
     * Identification of a File source used in the Dataflow job.
     * 
     */
    public List<FileIODetailsResponse> getFileDetails() {
        return this.fileDetails;
    }
    /**
     * Identification of a Pub/Sub source used in the Dataflow job.
     * 
     */
    public List<PubSubIODetailsResponse> getPubsubDetails() {
        return this.pubsubDetails;
    }
    /**
     * The SDK version used to run the job.
     * 
     */
    public SdkVersionResponse getSdkVersion() {
        return this.sdkVersion;
    }
    /**
     * Identification of a Spanner source used in the Dataflow job.
     * 
     */
    public List<SpannerIODetailsResponse> getSpannerDetails() {
        return this.spannerDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BigTableIODetailsResponse> bigTableDetails;
        private List<BigQueryIODetailsResponse> bigqueryDetails;
        private List<DatastoreIODetailsResponse> datastoreDetails;
        private List<FileIODetailsResponse> fileDetails;
        private List<PubSubIODetailsResponse> pubsubDetails;
        private SdkVersionResponse sdkVersion;
        private List<SpannerIODetailsResponse> spannerDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(JobMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigTableDetails = defaults.bigTableDetails;
    	      this.bigqueryDetails = defaults.bigqueryDetails;
    	      this.datastoreDetails = defaults.datastoreDetails;
    	      this.fileDetails = defaults.fileDetails;
    	      this.pubsubDetails = defaults.pubsubDetails;
    	      this.sdkVersion = defaults.sdkVersion;
    	      this.spannerDetails = defaults.spannerDetails;
        }

        public Builder setBigTableDetails(List<BigTableIODetailsResponse> bigTableDetails) {
            this.bigTableDetails = Objects.requireNonNull(bigTableDetails);
            return this;
        }

        public Builder setBigqueryDetails(List<BigQueryIODetailsResponse> bigqueryDetails) {
            this.bigqueryDetails = Objects.requireNonNull(bigqueryDetails);
            return this;
        }

        public Builder setDatastoreDetails(List<DatastoreIODetailsResponse> datastoreDetails) {
            this.datastoreDetails = Objects.requireNonNull(datastoreDetails);
            return this;
        }

        public Builder setFileDetails(List<FileIODetailsResponse> fileDetails) {
            this.fileDetails = Objects.requireNonNull(fileDetails);
            return this;
        }

        public Builder setPubsubDetails(List<PubSubIODetailsResponse> pubsubDetails) {
            this.pubsubDetails = Objects.requireNonNull(pubsubDetails);
            return this;
        }

        public Builder setSdkVersion(SdkVersionResponse sdkVersion) {
            this.sdkVersion = Objects.requireNonNull(sdkVersion);
            return this;
        }

        public Builder setSpannerDetails(List<SpannerIODetailsResponse> spannerDetails) {
            this.spannerDetails = Objects.requireNonNull(spannerDetails);
            return this;
        }

        public JobMetadataResponse build() {
            return new JobMetadataResponse(bigTableDetails, bigqueryDetails, datastoreDetails, fileDetails, pubsubDetails, sdkVersion, spannerDetails);
        }
    }
}
