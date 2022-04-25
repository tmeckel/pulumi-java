// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudSQLInstanceInfoResponse {
    /**
     * @return Name of a Cloud SQL instance.
     * 
     */
    private final String displayName;
    /**
     * @return External IP address of a Cloud SQL instance.
     * 
     */
    private final String externalIp;
    /**
     * @return Internal IP address of a Cloud SQL instance.
     * 
     */
    private final String internalIp;
    /**
     * @return URI of a Cloud SQL instance network or empty string if the instance does not have one.
     * 
     */
    private final String networkUri;
    /**
     * @return Region in which the Cloud SQL instance is running.
     * 
     */
    private final String region;
    /**
     * @return URI of a Cloud SQL instance.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private CloudSQLInstanceInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("externalIp") String externalIp,
        @CustomType.Parameter("internalIp") String internalIp,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("uri") String uri) {
        this.displayName = displayName;
        this.externalIp = externalIp;
        this.internalIp = internalIp;
        this.networkUri = networkUri;
        this.region = region;
        this.uri = uri;
    }

    /**
     * @return Name of a Cloud SQL instance.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return External IP address of a Cloud SQL instance.
     * 
     */
    public String externalIp() {
        return this.externalIp;
    }
    /**
     * @return Internal IP address of a Cloud SQL instance.
     * 
     */
    public String internalIp() {
        return this.internalIp;
    }
    /**
     * @return URI of a Cloud SQL instance network or empty string if the instance does not have one.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Region in which the Cloud SQL instance is running.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return URI of a Cloud SQL instance.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSQLInstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String externalIp;
        private String internalIp;
        private String networkUri;
        private String region;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSQLInstanceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public Builder internalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public CloudSQLInstanceInfoResponse build() {
            return new CloudSQLInstanceInfoResponse(displayName, externalIp, internalIp, networkUri, region, uri);
        }
    }
}
