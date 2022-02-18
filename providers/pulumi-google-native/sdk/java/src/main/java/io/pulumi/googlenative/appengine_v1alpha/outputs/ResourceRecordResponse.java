// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceRecordResponse {
    /**
     * Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'.
     * 
     */
    private final String name;
    /**
     * Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1).
     * 
     */
    private final String rrdata;
    /**
     * Resource record type. Example: AAAA.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","rrdata","type"})
    private ResourceRecordResponse(
        String name,
        String rrdata,
        String type) {
        this.name = Objects.requireNonNull(name);
        this.rrdata = Objects.requireNonNull(rrdata);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1).
     * 
     */
    public String getRrdata() {
        return this.rrdata;
    }
    /**
     * Resource record type. Example: AAAA.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String rrdata;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rrdata = defaults.rrdata;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRrdata(String rrdata) {
            this.rrdata = Objects.requireNonNull(rrdata);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ResourceRecordResponse build() {
            return new ResourceRecordResponse(name, rrdata, type);
        }
    }
}
