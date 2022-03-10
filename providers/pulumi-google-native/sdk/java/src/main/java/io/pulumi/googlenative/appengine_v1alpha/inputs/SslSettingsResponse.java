// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * SSL configuration for a DomainMapping resource.
 * 
 */
public final class SslSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslSettingsResponse Empty = new SslSettingsResponse();

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify no_managed_certificate on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    @InputImport(name="certificateId", required=true)
      private final String certificateId;

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * Whether the mapped certificate is an App Engine managed certificate. Managed certificates are created by default with a domain mapping. To opt out, specify no_managed_certificate on a CREATE or UPDATE request.
     * 
     */
    @InputImport(name="isManagedCertificate", required=true)
      private final Boolean isManagedCertificate;

    public Boolean getIsManagedCertificate() {
        return this.isManagedCertificate;
    }

    public SslSettingsResponse(
        String certificateId,
        Boolean isManagedCertificate) {
        this.certificateId = Objects.requireNonNull(certificateId, "expected parameter 'certificateId' to be non-null");
        this.isManagedCertificate = Objects.requireNonNull(isManagedCertificate, "expected parameter 'isManagedCertificate' to be non-null");
    }

    private SslSettingsResponse() {
        this.certificateId = null;
        this.isManagedCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateId;
        private Boolean isManagedCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(SslSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.isManagedCertificate = defaults.isManagedCertificate;
        }

        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }

        public Builder isManagedCertificate(Boolean isManagedCertificate) {
            this.isManagedCertificate = Objects.requireNonNull(isManagedCertificate);
            return this;
        }
        public SslSettingsResponse build() {
            return new SslSettingsResponse(certificateId, isManagedCertificate);
        }
    }
}
