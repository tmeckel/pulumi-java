// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceAttachmentConsumerProjectLimitResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAttachmentConsumerProjectLimitResponse Empty = new ServiceAttachmentConsumerProjectLimitResponse();

    /**
     * The value of the limit to set.
     * 
     */
    @InputImport(name="connectionLimit", required=true)
      private final Integer connectionLimit;

    public Integer getConnectionLimit() {
        return this.connectionLimit;
    }

    /**
     * The project id or number for the project to set the limit for.
     * 
     */
    @InputImport(name="projectIdOrNum", required=true)
      private final String projectIdOrNum;

    public String getProjectIdOrNum() {
        return this.projectIdOrNum;
    }

    public ServiceAttachmentConsumerProjectLimitResponse(
        Integer connectionLimit,
        String projectIdOrNum) {
        this.connectionLimit = Objects.requireNonNull(connectionLimit, "expected parameter 'connectionLimit' to be non-null");
        this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum, "expected parameter 'projectIdOrNum' to be non-null");
    }

    private ServiceAttachmentConsumerProjectLimitResponse() {
        this.connectionLimit = null;
        this.projectIdOrNum = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer connectionLimit;
        private String projectIdOrNum;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConsumerProjectLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionLimit = defaults.connectionLimit;
    	      this.projectIdOrNum = defaults.projectIdOrNum;
        }

        public Builder connectionLimit(Integer connectionLimit) {
            this.connectionLimit = Objects.requireNonNull(connectionLimit);
            return this;
        }

        public Builder projectIdOrNum(String projectIdOrNum) {
            this.projectIdOrNum = Objects.requireNonNull(projectIdOrNum);
            return this;
        }
        public ServiceAttachmentConsumerProjectLimitResponse build() {
            return new ServiceAttachmentConsumerProjectLimitResponse(connectionLimit, projectIdOrNum);
        }
    }
}
