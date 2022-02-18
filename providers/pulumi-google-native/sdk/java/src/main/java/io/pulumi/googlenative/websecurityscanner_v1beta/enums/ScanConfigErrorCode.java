// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the reason code for a configuration failure.
     * 
     */
    @EnumType
    public enum ScanConfigErrorCode {
        /**
         * There is no error.
         * 
         */
        CodeUnspecified("CODE_UNSPECIFIED"),
        /**
         * There is no error.
         * 
         */
        Ok("OK"),
        /**
         * Indicates an internal server error. Please DO NOT USE THIS ERROR CODE unless the root cause is truly unknown.
         * 
         */
        InternalError("INTERNAL_ERROR"),
        /**
         * One of the seed URLs is an App Engine URL but we cannot validate the scan settings due to an App Engine API backend error.
         * 
         */
        AppengineApiBackendError("APPENGINE_API_BACKEND_ERROR"),
        /**
         * One of the seed URLs is an App Engine URL but we cannot access the App Engine API to validate scan settings.
         * 
         */
        AppengineApiNotAccessible("APPENGINE_API_NOT_ACCESSIBLE"),
        /**
         * One of the seed URLs is an App Engine URL but the Default Host of the App Engine is not set.
         * 
         */
        AppengineDefaultHostMissing("APPENGINE_DEFAULT_HOST_MISSING"),
        /**
         * Google corporate accounts can not be used for scanning.
         * 
         */
        CannotUseGoogleComAccount("CANNOT_USE_GOOGLE_COM_ACCOUNT"),
        /**
         * The account of the scan creator can not be used for scanning.
         * 
         */
        CannotUseOwnerAccount("CANNOT_USE_OWNER_ACCOUNT"),
        /**
         * This scan targets Compute Engine, but we cannot validate scan settings due to a Compute Engine API backend error.
         * 
         */
        ComputeApiBackendError("COMPUTE_API_BACKEND_ERROR"),
        /**
         * This scan targets Compute Engine, but we cannot access the Compute Engine API to validate the scan settings.
         * 
         */
        ComputeApiNotAccessible("COMPUTE_API_NOT_ACCESSIBLE"),
        /**
         * The Custom Login URL does not belong to the current project.
         * 
         */
        CustomLoginUrlDoesNotBelongToCurrentProject("CUSTOM_LOGIN_URL_DOES_NOT_BELONG_TO_CURRENT_PROJECT"),
        /**
         * The Custom Login URL is malformed (can not be parsed).
         * 
         */
        CustomLoginUrlMalformed("CUSTOM_LOGIN_URL_MALFORMED"),
        /**
         * The Custom Login URL is mapped to a non-routable IP address in DNS.
         * 
         */
        CustomLoginUrlMappedToNonRoutableAddress("CUSTOM_LOGIN_URL_MAPPED_TO_NON_ROUTABLE_ADDRESS"),
        /**
         * The Custom Login URL is mapped to an IP address which is not reserved for the current project.
         * 
         */
        CustomLoginUrlMappedToUnreservedAddress("CUSTOM_LOGIN_URL_MAPPED_TO_UNRESERVED_ADDRESS"),
        /**
         * The Custom Login URL has a non-routable IP address.
         * 
         */
        CustomLoginUrlHasNonRoutableIpAddress("CUSTOM_LOGIN_URL_HAS_NON_ROUTABLE_IP_ADDRESS"),
        /**
         * The Custom Login URL has an IP address which is not reserved for the current project.
         * 
         */
        CustomLoginUrlHasUnreservedIpAddress("CUSTOM_LOGIN_URL_HAS_UNRESERVED_IP_ADDRESS"),
        /**
         * Another scan with the same name (case-sensitive) already exists.
         * 
         */
        DuplicateScanName("DUPLICATE_SCAN_NAME"),
        /**
         * A field is set to an invalid value.
         * 
         */
        InvalidFieldValue("INVALID_FIELD_VALUE"),
        /**
         * There was an error trying to authenticate to the scan target.
         * 
         */
        FailedToAuthenticateToTarget("FAILED_TO_AUTHENTICATE_TO_TARGET"),
        /**
         * Finding type value is not specified in the list findings request.
         * 
         */
        FindingTypeUnspecified("FINDING_TYPE_UNSPECIFIED"),
        /**
         * Scan targets Compute Engine, yet current project was not whitelisted for Google Compute Engine Scanning Alpha access.
         * 
         */
        ForbiddenToScanCompute("FORBIDDEN_TO_SCAN_COMPUTE"),
        /**
         * User tries to update managed scan
         * 
         */
        ForbiddenUpdateToManagedScan("FORBIDDEN_UPDATE_TO_MANAGED_SCAN"),
        /**
         * The supplied filter is malformed. For example, it can not be parsed, does not have a filter type in expression, or the same filter type appears more than once.
         * 
         */
        MalformedFilter("MALFORMED_FILTER"),
        /**
         * The supplied resource name is malformed (can not be parsed).
         * 
         */
        MalformedResourceName("MALFORMED_RESOURCE_NAME"),
        /**
         * The current project is not in an active state.
         * 
         */
        ProjectInactive("PROJECT_INACTIVE"),
        /**
         * A required field is not set.
         * 
         */
        RequiredField("REQUIRED_FIELD"),
        /**
         * Project id, scanconfig id, scanrun id, or finding id are not consistent with each other in resource name.
         * 
         */
        ResourceNameInconsistent("RESOURCE_NAME_INCONSISTENT"),
        /**
         * The scan being requested to start is already running.
         * 
         */
        ScanAlreadyRunning("SCAN_ALREADY_RUNNING"),
        /**
         * The scan that was requested to be stopped is not running.
         * 
         */
        ScanNotRunning("SCAN_NOT_RUNNING"),
        /**
         * One of the seed URLs does not belong to the current project.
         * 
         */
        SeedUrlDoesNotBelongToCurrentProject("SEED_URL_DOES_NOT_BELONG_TO_CURRENT_PROJECT"),
        /**
         * One of the seed URLs is malformed (can not be parsed).
         * 
         */
        SeedUrlMalformed("SEED_URL_MALFORMED"),
        /**
         * One of the seed URLs is mapped to a non-routable IP address in DNS.
         * 
         */
        SeedUrlMappedToNonRoutableAddress("SEED_URL_MAPPED_TO_NON_ROUTABLE_ADDRESS"),
        /**
         * One of the seed URLs is mapped to an IP address which is not reserved for the current project.
         * 
         */
        SeedUrlMappedToUnreservedAddress("SEED_URL_MAPPED_TO_UNRESERVED_ADDRESS"),
        /**
         * One of the seed URLs has on-routable IP address.
         * 
         */
        SeedUrlHasNonRoutableIpAddress("SEED_URL_HAS_NON_ROUTABLE_IP_ADDRESS"),
        /**
         * One of the seed URLs has an IP address that is not reserved for the current project.
         * 
         */
        SeedUrlHasUnreservedIpAddress("SEED_URL_HAS_UNRESERVED_IP_ADDRESS"),
        /**
         * The Web Security Scanner service account is not configured under the project.
         * 
         */
        ServiceAccountNotConfigured("SERVICE_ACCOUNT_NOT_CONFIGURED"),
        /**
         * A project has reached the maximum number of scans.
         * 
         */
        TooManyScans("TOO_MANY_SCANS"),
        /**
         * Resolving the details of the current project fails.
         * 
         */
        UnableToResolveProjectInfo("UNABLE_TO_RESOLVE_PROJECT_INFO"),
        /**
         * One or more blacklist patterns were in the wrong format.
         * 
         */
        UnsupportedBlacklistPatternFormat("UNSUPPORTED_BLACKLIST_PATTERN_FORMAT"),
        /**
         * The supplied filter is not supported.
         * 
         */
        UnsupportedFilter("UNSUPPORTED_FILTER"),
        /**
         * The supplied finding type is not supported. For example, we do not provide findings of the given finding type.
         * 
         */
        UnsupportedFindingType("UNSUPPORTED_FINDING_TYPE"),
        /**
         * The URL scheme of one or more of the supplied URLs is not supported.
         * 
         */
        UnsupportedUrlScheme("UNSUPPORTED_URL_SCHEME");

        private final String value;

        ScanConfigErrorCode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScanConfigErrorCode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
