// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1beta.inputs.IapTestServiceAccountInfoResponse;
import java.util.Objects;


/**
 * Describes authentication configuration for Identity-Aware-Proxy (IAP).
 * 
 */
public final class IapCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final IapCredentialResponse Empty = new IapCredentialResponse();

    /**
     * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
     */
    @Import(name="iapTestServiceAccountInfo", required=true)
    private IapTestServiceAccountInfoResponse iapTestServiceAccountInfo;

    /**
     * @return Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
     * 
     */
    public IapTestServiceAccountInfoResponse iapTestServiceAccountInfo() {
        return this.iapTestServiceAccountInfo;
    }

    private IapCredentialResponse() {}

    private IapCredentialResponse(IapCredentialResponse $) {
        this.iapTestServiceAccountInfo = $.iapTestServiceAccountInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IapCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IapCredentialResponse $;

        public Builder() {
            $ = new IapCredentialResponse();
        }

        public Builder(IapCredentialResponse defaults) {
            $ = new IapCredentialResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param iapTestServiceAccountInfo Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
         * 
         * @return builder
         * 
         */
        public Builder iapTestServiceAccountInfo(IapTestServiceAccountInfoResponse iapTestServiceAccountInfo) {
            $.iapTestServiceAccountInfo = iapTestServiceAccountInfo;
            return this;
        }

        public IapCredentialResponse build() {
            $.iapTestServiceAccountInfo = Objects.requireNonNull($.iapTestServiceAccountInfo, "expected parameter 'iapTestServiceAccountInfo' to be non-null");
            return $;
        }
    }

}
